package dapimpl;

import dao.DBUtils;
import dao.UserDao;
import entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static final String String = null;

    public int add(User user) {
        // TODO Auto-generated method stub
        String sql = "insert into user(id,gh,yhm,mm,sf,sex,age,phone)value(?,?,?,?,?,?,?,?)";
        DBUtils.update(sql, user.getId(), user.getGh(), user.getYhm(), user.getMm(), user.getSf(),
                user.getSex(), user.getAge(), user.getPhone());
        return 0;
    }

    @Override
    public int delete(User user) {
        // TODO Auto-generated method stub
        String sql = "delete from user where yhm=? AND gh=?";
        DBUtils.update(sql, user.getYhm(), user.getGh());
        return 0;
    }

    @Override
    public int delete1(User user) {
        String sql = "delete from user where sf=?";
        DBUtils.update(sql, user.getSf());
        return 0;
    }

    @Override
    public int update(User user) {
        // TODO Auto-generated method stub
        String sql = "update user set yhm=?,sex=?,age=? where gh=?";
        Object[] params = {user.getYhm(), user.getSex(), user.getAge(), user.getGh()};
        int line = 0;
        try {
            line = DBUtils.executeUpdate(sql, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    @Override
    public List<User> getByType(int type) {
        // TODO Auto-generated method stub
        List<User> productlist = new ArrayList<User>();
        String sql = "select *from user where yhm=?";
        List<HashMap<String, Object>> maplist = DBUtils.executeQuery2(sql, type);
        for (int i = 0; i < maplist.size(); i++) {
            HashMap<String, Object> map = maplist.get(i);
            User user = new User();
            user.setId((String) map.get("id"));
            user.setGh((String) map.get("gh"));
            user.setYhm((String) map.get("yhm"));
            user.setMm((String) map.get("mm"));
            user.setSf((String) map.get("sf"));
            user.setSex((String) map.get("sex"));
            user.setAge((String) map.get("age"));
            user.setPhone((String) map.get("phone"));

            productlist.add(user);

        }

        return productlist;
    }

    @Override
    public User getById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}

package daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import dao.DBUtils;
import dao.ProductDao;
import entity.Product;

public class ProductDaoImpl implements ProductDao {

    @Override
    public int add(Product product) {
        // TODO Auto-generated method stub
        int code=0;
        String sql="insert into products (id,name,price,num,type) values(?,?,?,?,?)";

        code=DBUtils.update(sql, product.getId(),
                product.getName(),
                product.getPrice(),
                product.getNum(),
                product.getType());
        return code;
    }

    @Override
    public int delete(Product product) {
        // TODO Auto-generated method stub
        int code=0;
        String sql="delete from products where id=?";

        code=DBUtils.update(sql, product.getId());
        return code;
    }

    @Override
    public int delete(int productid) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Product> getById(int type) {
        String sql="select * from products where type=?";

        List<Product> productlist=new ArrayList<Product>();

        List<Map<String, Object>> maplist= DBUtils.query(sql, new Integer(type));
        for(Map<String, Object> map:maplist){
            Product product=new Product();
            product.setId((Integer)(map.get("id")));
            product.setName((String)(map.get("name")));
            product.setPrice((Double)(map.get("price")));
            product.setNum((Integer)(map.get("num")));
            product.setType((Integer)(map.get("type")));

            productlist.add(product);
        }
        return productlist;
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}

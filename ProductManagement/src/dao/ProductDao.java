package dao;

import java.util.List;

import entity.Product;
/*
 * Dao接口，是业务和DAO实现层协商定义的。业务根据需要向DAO实现层提数据读取原子操作
 */
public interface ProductDao {

    int add(Product product);

    int delete(Product product);

    /*
     * 形参：产品ID
     * 功能：删除产品ID对应的产品记录；
     * 返回值：如果删除成功，返回1；否则：0
     */
    int delete(int productid);

    List<Product> getById(int type);

    List<Product> getAll();
}

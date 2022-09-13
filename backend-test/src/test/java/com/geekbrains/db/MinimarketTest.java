package com.geekbrains.db;

import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Products;
import com.geekbrains.db.model.ProductsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class MinimarketTest {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("myBatisConfig.xml"));

        try (SqlSession session = sessionFactory.openSession()) {
            /**  ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
             Products product = productsMapper.selectByPrimaryKey(444L);
             System.out.println(product); **/

            ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
            ProductsExample example = new ProductsExample();
            example.createCriteria()
                    .andTitleLike("Orange")
                    .andPriceGreaterThan(10);

            List<Products> products = productsMapper.selectByExample(example);
            System.out.println(products);

            example.createCriteria().andCategoryIdEqualTo(2L);
            products = productsMapper.selectByExample(example);
            System.out.println(products);

            productsMapper.deleteByPrimaryKey(100L);
            products = productsMapper.selectByExample(example);
            System.out.println(products);
            example.clear();

        }
    }
}

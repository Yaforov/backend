package com.geekbrains.db.model;

public class Products {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.title
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.price
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.category_id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    private Long categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.id
     *
     * @return the value of products.id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.id
     *
     * @param id the value for products.id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.title
     *
     * @return the value of products.title
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.title
     *
     * @param title the value for products.title
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.price
     *
     * @return the value of products.price
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.price
     *
     * @param price the value for products.price
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.category_id
     *
     * @return the value of products.category_id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.category_id
     *
     * @param categoryId the value for products.category_id
     *
     * @mbg.generated Tue Sep 13 08:08:04 GMT+03:00 2022
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
package javase.forobject.thisdemo.dianshangxitong;

public class CustomerList {
    // 用于保存对象的数组
    private Customer[] customers;
    // 记录已保存的用户的数量
    private int total;

    /**
     * 构造起器用来初始化 customer 数组
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将 customer 添加到组中最后一个客户对象记录之后
     * @param customer
     * @return 添加成功返回 true，否则返回 false
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 替换指定位置的用户信息
     * @param index
     * @param customer
     * @return
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    /**
     * 删除指定位置的用户对象记录
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 && index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 返回所有的用户对象
     * @return
     */
    public Customer[] getCustomers() {
        Customer[] customers = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers[i] = this.customers[i];
        }
        return customers;
    }

    /**
     * 返回指定位置的客户信息
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if (index >= 0 && index < total) {
            return customers[index];
        }
        return null;
    }


    /**
     * 获得客户列表中客户的数量
     * @return
     */
    public int getTotal() {
        return total;
    }
}

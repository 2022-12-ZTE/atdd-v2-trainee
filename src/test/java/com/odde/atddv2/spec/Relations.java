package com.odde.atddv2.spec;

import com.github.leeonky.jfactory.Spec;
import com.odde.atddv2.entity.datarelation.*;

public class Relations {
    public static class 品类 extends Spec<Category> {
        @Override
        public void main() {
            property("id").ignore();
        }
    }

    public static class 商品 extends Spec<Product> {
        @Override
        public void main() {
            property("id").ignore();
            property("category").is(品类.class);
        }
    }

    public static class 客户 extends Spec<Customer> {
        @Override
        public void main() {
            property("id").ignore();
        }
    }

    public static class 订单 extends Spec<Order> {
        @Override
        public void main() {
            property("id").ignore();
            property("product").is(商品.class);
            property("customer").is(客户.class);
        }
    }

    public static class 支付记录 extends Spec<Transaction> {

        @Override
        public void main() {
            property("id").ignore();
            property("order").is(订单.class);
        }
    }
}

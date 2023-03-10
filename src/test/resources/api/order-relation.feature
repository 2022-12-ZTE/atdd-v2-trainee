# language: zh-CN
@api-login
功能: 真实订单查询

  场景: 商品品类查询
    假如存在"品类":
      | name | description |
      | car  | many cars   |

#  场景: 商品查询
#    假如存在"商品":
#      | name  | description | status |
#      | Tesla | a car       | ENABLE |
#
#  场景: 指定品类的商品查询
#    假如存在"商品":
#      | category.name | name  | description | status |
#      | car           | Tesla | a car       | ENABLE |
#
#  场景: 指定品类的商品查询
#    假如存在"品类":
#      | name           | description       |
#      | given category | given description |
#    假如存在"商品":
#      | category.name  | name  | description | status |
#      | given category | Tesla | a car       | ENABLE |
#
#  场景: 关联订单
#    假如存在"品类":
#      | name | description |
#      | car  | many cars   |
#    假如存在"商品":
#      | name  | description | status |
#      | Tesla | a car       | ENABLE |
#    假如存在"客户":
#      | name | mobile      | gender |
#      | Tom  | 13800000000 | male   |
#    假如存在"订单":
#      | code | product.name | customer.name | status | total  |
#      | 001  | Tesla        | Tom           | PAID   | 200000 |
#    假如存在"支付记录":
#      | type | amount | status   | order.code |
#      | CASH | 20000  | FINISHED | 001        |
#
#  场景: 支付查询
#    假如存在"支付记录":
#      | type | amount | status   |
#      | CASH | 20000  | FINISHED |
#
#  场景: 多个支付查询
#    假如存在100个"支付记录"

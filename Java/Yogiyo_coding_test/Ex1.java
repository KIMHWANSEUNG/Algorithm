package Yogiyo_coding_test;

import java.util.HashMap;

public class Ex1 {

    /*
     * 문제 :
     * 
     * 파티를 위해 피자를 주문합니다. 주문(구매할 품목 목록)과 피자 가게 메뉴(모든 구매 가능한 품목과 가격 목록)가 제공됩니다.
     * 
     * 피자 가게는 다음과 같은 할인을 제공합니다.
     * 
     * 할인 1: "3개 구매 시 가장 싼 것은 무료!"
     * 할인 2: "5개 구매 시 100원!"
     * 할인 3: "대형 피자 1개당 소형 피자 1개 무료!"
     * 할인 4: "대형 피자 3개 구매 시 중형 피자 3개 비용 지불!"
     * 목표는 피자 가게에서 제공하는 할인 중 최대 1개를 사용하여 주문의 총 비용을 최소화하는 것입니다.
     * 
     * 모든 할인의 작동 방식에 대한 정확한 설명은 예제 섹션에서 찾을 수 있습니다.
     * 
     * 사양:
     * 다음 선언이 주어진다고 가정합니다.
     * 
     * 메뉴는 Pizza 객체의 배열로 구성됩니다. 여기서:
     * 
     * name은 피자의 이름을 나타냅니다. 모든 이름은 메뉴 배열에 정확히 한 번 나타납니다.
     * price_S, price_M, price_L은 각각 이 피자의 "Small", "Medium", "Large" 버전에 대한 가격을
     * 나타냅니다.
     * 마찬가지로, 주문은 OrderItem 객체의 배열로 구성됩니다. 여기서:
     * 
     * name은 주문하려는 피자의 이름을 나타냅니다.
     * size는 주문하려는 피자의 크기를 지정합니다("Small", "Medium" 또는 "Large").
     * Quantity는 이 이름과 크기를 가진 피자의 수를 주문하려는 피자를 지정합니다.
     * 모든 (name, size) 쌍은 order 배열에 최대 한 번 나타납니다.
     * 
     * 사양:
     * 다음 선언이 주어진다고 가정합니다.
     * 
     * 메뉴는 Pizza 객체의 배열로 구성됩니다. 여기서:
     * 
     * name은 피자의 이름을 나타냅니다. 모든 이름은 메뉴 배열에 정확히 한 번 나타납니다.
     * price_S, price_M, price_L은 각각 이 피자의 "Small", "Medium", "Large" 버전에 대한 가격을
     * 나타냅니다.
     * 마찬가지로 주문은 OrderItem 객체의 배열로 구성됩니다. 여기서:
     * 
     * name은 주문하려는 피자의 이름을 나타냅니다.
     * size는 주문하려는 피자의 크기를 지정합니다("Small", "Medium" 또는 "Large").
     * Quantity는 이 이름과 크기의 피자를 주문하려는 수량을 지정합니다.
     * 모든 (name, size) 쌍은 order 배열에 최대 한 번 나타납니다.
     * 
     * 길이가 N인 메뉴 배열과 길이가 M인 주문 배열이 주어졌을 때 피자 가게에서 제공하는 할인 중 하나를 사용할 때(또는 할인이 주어진 주문에
     * 적용되지 않는 경우 할인을 사용하지 않을 때) 지불해야 하는 최소 금액을 반환하는 함수를 작성하세요.
     * 
     * 예:
     * 할인 1: 3개를 구매하면 가장 싼 피자가 무료입니다!
     * 주문에 피자가 최소 3개(반드시 다를 필요는 없음)가 포함되어 있는 경우 전체 주문에서 가장 싼 피자 한 개에 대한 비용을 지불하지 않도록
     * 선택할 수 있습니다. 이 할인은 주문당 최대 한 번 사용할 수 있으며 주문을 분할할 수 없습니다.
     * 
     * 예를 들어:
     * 귀하의 함수는 14를 반환해야 합니다. 왜냐하면 텍사스 피자 한 개와 유럽 피자 한 개에 대해서만 지불하고 다른 유럽 피자는 무료이기
     * 때문입니다.
     * 
     * 대형 피자는 소형 피자보다 저렴할 수 있습니다.
     * 
     * 할인 2: 5개를 사면 100원!
     * 주문에 같은 이름의 피자가 5개 이상 포함된 경우, 그중 5개를 선택하여 총 100원이 되도록 할 수 있습니다. 이전 할인과 마찬가지로
     * 주문당 최대 한 번만 사용할 수 있으며 주문을 분할할 수 없습니다.
     * 
     * 예를 들어:
     * 귀하의 함수는 900을 반환해야 합니다. 왜냐하면 중형 피자 한 개와 소형 마게리타 네 개에 100원을 지불하고 다른 모든 것에는 정상
     * 가격을 지불하도록 선택할 수 있기 때문입니다.
     * 
     * 할인을 그리스 피자 5개나 카프리초사 5개에 사용할 수 있지만 총 비용이 더 높아집니다. 마찬가지로 "3개를 사면 가장 싼 피자는 무료!"
     * 할인을 사용할 수 있지만 총 비용이 더 높아집니다.
     * 
     * 할인 3: 대형 피자 한 개당 소형 피자 한 개를 무료로 받으세요!
     * 주문에 같은 이름의 대형 피자와 소형 피자가 포함되어 있는 경우 소형 피자를 무료로 받을 수 있습니다. 조건을 충족하고 다른 할인을
     * 사용하지 않는 경우 이 할인을 원하는 횟수만큼 사용할 수 있습니다.
     * 
     * 할인 3: 대형 피자를 구매하면 소형 피자를 무료로 받으세요!
     * 
     * 주문에 같은 이름의 "대형" 피자와 "소형" 피자가 포함되어 있는 경우 "소형" 피자를 무료로 받을 수 있습니다. 조건을 충족하고 다른
     * 할인을 사용하지 않는 경우 이 할인을 원하는 횟수만큼 사용할 수 있습니다.
     * 
     * 예를 들어:
     * 
     * menu = [
     * Pizza(name="margherita", price_S=7, price_M=8, price_L=10),
     * Pizza(name="hawaii", price_S=8, price_M=9, price_L=12),
     * Pizza(name="capricciosa", price_S=5, price_M=7, price_L=13),
     * ]
     * 
     * order = [
     * OrderItem(name="margherita", size="Small", Quantity=3),
     * OrderItem(name="capricciosa", size="Large", Quantity=2),
     * OrderItem(name="capricciosa", size="Small", Quantity=5),
     * OrderItem(name="hawaii", size="Large", Quantity=3),
     * OrderItem(name="margherita", size="Large", Quantity=1),
     * OrderItem(name="hawaii", size="Medium", Quantity=1),
     * OrderItem(name="capricciosa", size="Medium", Quantity=1),
     * ]
     * 귀하의 함수는 117을 반환해야 합니다. "Small" 마게리타 1개와 "Small" 카프리초사 2개에 대한 비용을 지불하지 않기로 선택할
     * 수 있기 때문입니다.
     * 
     * "Large" 카프리초사가 충분하지 않아 여전히 "Small" 카프리초사 3개에 대한 비용을 지불해야 합니다.
     * 
     * 할인 4: Large 3개를 구매하면 Medium 3개에 대한 비용을 지불하세요!
     * 
     * 주문에 "Large" 피자 3개 이상이 포함된 경우,
     * 
     * 함수는 102를 반환해야 합니다. "Large" newyorker 피자 1개와 "Large" boston 피자 2개를 "Medium"
     * 피자인 것처럼 지불하도록 선택할 수 있기 때문입니다.
     * 
     * 다른 3개의 대형 피자를 선택하면 할인이 더 적게 적용됩니다.
     * 
     * 코너 케이스: 할인 없음
     * 
     * 주문한 피자의 수가 할인을 사용하기에 충분하지 않으면 프로그램은 주문의 총 비용을 반환해야 합니다.
     * 
     * 예를 들어:
     * 
     * menu = [
     * 
     * Pizza(name="margherita", price_S=7, price_M=8, price_L=10),
     * 
     * Pizza(name="hawaii", price_S=8, price_M=9, price_L=12),
     * 
     * Pizza(name="capricciosa", price_S=5, price_M=7, price_L=13),
     * 
     * ]
     * 
     * order = [
     * 
     * OrderItem(name="margherita", size="Small", Quantity=1),
     * 
     * OrderItem(name="hawaii", size="Large", Quantity=1),
     * 
     * ]
     * 
     * 함수는 19를 반환해야 합니다.
     * 
     * 채점:
     * 
     * 해결책은 다양한 시나리오에서 독립적으로 테스트됩니다. 특히, 이 할인이 다른 할인보다 적용하기에 더 적합한 모든 할인에 대한 별도의
     * 시나리오가 있습니다.
     * 
     * 할인이 적용되지 않는 시나리오도 있습니다(총 5가지 시나리오).
     * 
     * 이 작업에 대해 달성 가능한 최대 점수는 모든 시나리오에 동일하게 분배됩니다.
     * 
     * 즉, 예를 들어 4가지 할인 중 2가지만 구현하는 솔루션도 전체 작업 점수의 최대 60%를 얻을 수 있습니다.
     * 
     * 제약 조건:
     * 
     * 다음을 가정합니다.
     * 
     * N(메뉴 배열 길이)은 [1..10] 범위 내의 정수입니다.
     * M(주문 배열 길이)은 [1..30] 범위 내의 정수입니다.
     * 주문에 있는 모든 항목의 수량은 [1..10] 범위 내의 정수입니다.
     * 메뉴에 있는 모든 가격은 [1..1000] 범위 내의 정수입니다.
     * 메뉴와 주문에 있는 모든 이름은 최대 20자의 소문자로 구성된 비어 있지 않은 문자열입니다.
     * 주문에 있는 모든 이름은 메뉴에도 있습니다.
     * 특정 이름과 크기를 가진 각 주문 항목은 테스트 사례마다 고유합니다.
     * 주문에 포함된 품목의 각 크기는 "소형", "중형", "대형"입니다.
     */
    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();

        /*
         * [
         * [
         * Pizza(name="margherita", price_S=7, price_M=8, price_L=10),
         * Pizza(name="hawaii", price_S=8, price_M=9, price_L=12),
         * Pizza(name="capricciosa", price_S=5, price_M=7, price_L=13),
         * ]
         * ]
         */
        Pizza[] menu = {
                new Pizza("margherita", 7, 8, 10),
                new Pizza("hawaii", 8, 9, 12),
                new Pizza("capricciosa", 5, 7, 13)
        };

        /*
         * order = [
         * OrderItem(name="margherita", size="Small", quantity=3),
         * OrderItem(name="capricciosa", size="Large", quantity=2),
         * OrderItem(name="hawaii", size="Large", quantity=3),
         * OrderItem(name="margherita", size="Large", quantity=1),
         * OrderItem(name="hawaii", size="Medium", quantity=1),
         * OrderItem(name="capricciosa", size="Small", quantity=5),
         * OrderItem(name="capricciosa", size="Medium", quantity=1),
         * ]
         */
        OrderItem[] order = {
                new OrderItem("margherita", "Small", 3),
                new OrderItem("capricciosa", "Large", 2),
                new OrderItem("hawaii", "Large", 3),
                new OrderItem("margherita", "Large", 1),
                new OrderItem("hawaii", "Medium", 1),
                new OrderItem("capricciosa", "Small", 5),
                new OrderItem("capricciosa", "Medium", 1)
        };

        System.out.println(ex1.solution(menu, order));

    }

    public int solution(Pizza[] menu, OrderItem[] order) {
        // menu를 기준으로 order에 있는 피자들의 가격을 return 합니다.

        int resultPrice = 0;
        int pizzaQuantity = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < menu.length; j++) {

                if (order[i].name.equals(menu[j].name)) {
                    if (order[i].size.equals("Small")) {
                        resultPrice += menu[j].price_S * order[i].quantity;
                    } else if (order[i].size.equals("Medium")) {
                        resultPrice += menu[j].price_M * order[i].quantity;
                    } else if (order[i].size.equals("Large")) {
                        resultPrice += menu[j].price_L * order[i].quantity;
                    }
                }
            }
            pizzaQuantity += order[i].quantity;
        }

        resultPrice = discountPrice(resultPrice, menu, order, pizzaQuantity);

        return resultPrice;

    }

    public int discountPrice(int resultPrice, Pizza[] menu, OrderItem[] order, int pizzaQuantity) {
        // 할인 기준

            int minPrice = 10000;
            for (Pizza pizzaMenu : menu) {

                int pizzaMenuQuantity = 0;

                for (OrderItem orderItem : order) {

                    // 할인 1 최소 가격 찾아내기
                    if(orderItem.name.equals(pizzaMenu.name) && minPrice > pizzaMenu.price_S) {
                        minPrice = pizzaMenu.price_S;
                    }

                    if (orderItem.name.equals(pizzaMenu.name)) {
                        // 할인 2 피자 메뉴 수량 구하기"
                        pizzaMenuQuantity += orderItem.quantity;
                    }

                    // 할인 2: "동일한 이름의 피자 5개 구매 시 100원!"
                    if (pizzaMenuQuantity >= 5) {
                        resultPrice -= 100;
                    }

                    // 할인 3: "대형 피자 1개당 소형 피자 1개 무료!"
                    if (orderItem.name.equals(pizzaMenu.name) && orderItem.size.equals("Large")) {
                        System.out.println("pizzaMenu.name : " + pizzaMenu.name);
                        int discount3Quantity = 0;
                        for (OrderItem orderItem2 : order) {
                            if (orderItem2.name.equals(pizzaMenu.name) && orderItem2.size.equals("Small")) {
                                discount3Quantity = orderItem.quantity > orderItem2.quantity ? orderItem2.quantity
                                        : orderItem.quantity;
                            }
                        }
                        System.out.println("discount3Quantity : " + discount3Quantity);
                        resultPrice -= pizzaMenu.price_S * discount3Quantity;

                    }

                    // 할인 4: "대형 피자 3개 구매 시 중형 피자 3개 비용 무료!"
                    if (orderItem.name.equals(pizzaMenu.name) && orderItem.size.equals("Large")
                            && orderItem.quantity >= 3) {
                        int discount4Quantity = 0;
                        for (OrderItem orderItem2 : order) {
                            if (orderItem2.name.equals(pizzaMenu.name) && orderItem2.size.equals("Medium")) {
                                discount4Quantity = orderItem.quantity > orderItem2.quantity ? orderItem2.quantity
                                        : orderItem.quantity;
                                discount4Quantity = discount4Quantity > 3 ? 3 : discount4Quantity;
                            }
                        }

                        System.out.println("discount4Quantity : " + discount4Quantity);
                        resultPrice -= pizzaMenu.price_M * discount4Quantity;
                    }
                }
            }
            // 할인 1: "3개 구매 시 가장 싼 것은 무료!"
            if(pizzaQuantity >= 3){
                resultPrice -= minPrice;
            }

        

        return resultPrice;
    }

}

class Pizza {

    public String name;
    public int price_S;
    public int price_M;
    public int price_L;

    public Pizza(String name, int price_S, int price_M, int price_L) {
        this.name = name;
        this.price_S = price_S;
        this.price_M = price_M;
        this.price_L = price_L;
    }

}

class OrderItem {
    public String name;
    public String size;
    public int quantity;

    public OrderItem(String name, String size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }
}

public class Main2 {
    public static void main(String[] args) {
    
      // Объявляете переменные для входных данных и
      // параметров программы: начального счёта, 
      // суммы пополнения и тп
      int initCount = 100;
      int addCount = 1100;

      int totalCount;
      // Условным оператором проверяете, превысила ли
      // сумма пополнения порог, и для этих двух разных
      // сценариев рассчитываете сумму бонуса и выводите
      // на экран.
      System.out.println("Начислено " + addCount + " руб.");
      if (addCount >= 1000) {
        int bonusCount = addCount / 100;
        totalCount = initCount + addCount + bonusCount;
        System.out.println("Бонус: " + bonusCount + " руб.");
      } else {
        totalCount = initCount + addCount;
      }
      System.out.println("У вас на счету теперь " + totalCount + " рублей.");
    }
  }
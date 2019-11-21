package Day24.HW24_1;

public class HW24_1 {

    public static void main(String[] args) {
        Credit credit1 = new Credit("CR1", 100, 10,10);
        Credit credit2 = new Credit("CR2", 200, 5,1);
        Credit credit3 = new Credit("CR3", 300, 2,3);
        Credit credit4 = new Credit("CR4", 400, 1,5);
        Credit credit5 = new Credit("CR5", 500, 12,2);

        System.out.println("Credit.getTotalSum() = " + Credit.getTotalSum());
        System.out.println("Credit.getCreditsAmount() = " + Credit.getCreditsAmount());
        System.out.println("Credit.getSumAVG() = " + Credit.getSumAVG());

        //Бонус: Возможно ли подсчитать средневзвешенную ставку* по выданным кредитам?
        // Если возможно, то почему? Если нет, то почему?

        //Iср.вз.=Сум.(Sост.*Ітек.)/Сум.Sост.,
        //
        //где Sост. – остаток долга кредита;
        //
        //Iтек. – текущая процентная ставка.
        //
        //Для удобства расчет ведут в таблицах Excel, используя специальную формулу «СУММПРОИЗВ».

    }

}

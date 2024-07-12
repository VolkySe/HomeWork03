import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
    /*Задача 1.
    Объявите переменные типа int, byte, short, long, float, double.
    Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
    Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        int intgr01 = 187654321;
        byte bte01 = 22;
        short shrt01 = 32000;
        /* long lng01 = 9100200300400500600; сообщение too large, почему? в подсказке было число чуть больше */
        long lng01 = 4100200300400500600L;
        float flt01 = 500800700600500400300200100000.1234567891011121314151617F;
        double dble01 = 600800700600500400300200100000.123456789101112131417687687687687687687686876868767887687687687651617D;
        System.out.println("Задача 1:");
        System.out.println("Значение переменной intgr01 с типом int равно " + intgr01);
        System.out.println("Значение переменной bte01 с типом byte равно " + bte01);
        System.out.println("Значение переменной shrt01 с типом short равно " + shrt01);
        System.out.println("Значение переменной lng01 с типом long равно " + lng01);
        System.out.println("Значение переменной flt01 с типом float равно " + flt01);
        System.out.println("Значение переменной dble01 с типом double равно " + dble01);
    /*
    Задача 2
    Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:     27.12   987 678 965 549    2,786    569    -159    27897    67
    */
        System.out.println("Задача 2 (вывод не требуется):");
        float flt02A = 27.12F;
        var str02A = "987 678 965 549"; /* тут, пожалуй, должен существовать метод убирающий пробелы*/
        long intg02 = Long.parseLong(str02A.replaceAll(" ", ""));
        /*нашел... https://sky.pro/media/udalenie-probelov-iz-stroki-v-java/ */
        /* System.out.println(intg02) я-прав */
        float flt02B = 2.786F;
        var str02B = "2,786";
        /* а, значит, такое же должно существовать для запятой */
        float flt02Bs = Float.parseFloat(str02B.replaceAll(",", "."));
        /* System.out.println(flt02Bs) неужели обязательно менять запятые на точки, чтобы конвертировать? */
        short shrt02A = 569;
        short shrt02B = -159;
        short shrt02C = 27897;
        short shrt02D = 67;
        System.out.println(flt02A + " " + str02A + " " + intg02 + " " + flt02B + " " + str02B +
                " " + flt02Bs + " " + shrt02A + " " + shrt02B + " " + shrt02C + " " + shrt02D);
    /*
    Задача 3
    Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
    У Людмилы Павловны — 23 ученика, у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
    Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов
    каждому ученику.
    Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
    Для объявления переменных не используйте тип var.
     */
        System.out.println("Задача 3:");
        int class01 = 23;
        int class02 = 27;
        int class03 = 30;
        int totalSheets = 480;
        System.out.println("На каждого ученика рассчитано по " + totalSheets / (class01 + class02 + class03) +
                " целых лист(a, ов) бумаги");

    /*
    Задача 4
    Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
    за 20 минут,
    в сутки,
    за 3 дня,
    за 1 месяц?
    Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток
    времени.
    Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
    Для объявления переменных не используйте тип var.
     */
        System.out.println("Задача 4:");
        float controlTime = 2.0F; // использовал дробное время, контрольный замер времени
        int controlBottles = 16; // целое количество единиц продукции, контрольный замер количества
        int bottlesPerMin = (int) (controlBottles/controlTime);

        System.out.println("За 20 минут машина произвела " + bottlesPerMin * 20 + " шт. бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerMin * 24 * 60 + " шт. бутылок");
        System.out.println("За три дня машина произвела " + bottlesPerMin * 24 * 60 * 3 + " шт. бутылок");
        //https://sky.pro/wiki/java/poluchenie-kolichestva-dney-v-mesyatse-s-java-reshenie
        Calendar daysPastMonth = Calendar.getInstance();
        daysPastMonth.add(Calendar.MONTH, -1); /* хто_знает чего это такое, пока что, но работает */
        //        System.out.println(daysPastMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        // берём прошлый месяц, только он полностью завершён
        System.out.println("За прошлый месяц машина произвела " +
                (24 * 60 * (daysPastMonth.getActualMaximum(Calendar.DAY_OF_MONTH))) * bottlesPerMin +
                " шт. бутылок");

        /*
        Задача 5
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и
        4 банки коричневой краски. Сколько банок каждой краски было куплено.
        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок
        коричневой краски».
        Для объявления переменных не используйте тип var.
        */
        System.out.println("Задача 5:");
        int totalCansCount = 120;
        float whiteCansNeededPerRoom = 2.0F;
        float brownCansNeededPerRoom = 4.0F;
        int totalRoomsCount = Math.round(totalCansCount / (whiteCansNeededPerRoom + brownCansNeededPerRoom));
        System.out.println("В школе, где " + totalRoomsCount + " класс(а,ов), нужно " +
                Math.ceil(totalRoomsCount * whiteCansNeededPerRoom) + " банок белой краски и " +
                Math.ceil(totalRoomsCount * brownCansNeededPerRoom) + " банок коричневой краски");

        /*Задача 6
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
                Молоко — 200 мл (100 мл = 105 грамм).
                Мороженое-пломбир — 2 брикета по 100 грамм.
                Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
                Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортивного завтрака, а затем переведите его в килограммы.
                Результат в граммах и килограммах напечатайте в консоль.*/

        System.out.println("Задача 6:");
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        float totalBreakfastWeight = bananas + milk + iceCream + eggs;
        System.out.println("Вес такого спортивного завтрака составляет " + totalBreakfastWeight + " гр. или " +
                totalBreakfastWeight / 1000 + " кг.");

        /*Задача 7
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.*/
        System.out.println("Задача 6:");
        int weightLossNeeded = 7;
        int weightLossSpeedMin = 250;
        int weightLossSpeedMax = 500;
        System.out.println("Максимальный срок при скорости снижения по " +
                weightLossSpeedMin + " гр. в день составит - " + weightLossNeeded * 1000 / weightLossSpeedMin +
                "дн., а при максимальной скорости по " +
                weightLossSpeedMax + " гр. в день минимальный срок составит - " + weightLossNeeded * 1000 / weightLossSpeedMax +
                " дн. При этом среднее арифметическое сроков похудения составит " +
                (weightLossNeeded * 1000 / ((weightLossSpeedMin + weightLossSpeedMax) / 2) + " дн."));

        /*Задача 8
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании
        есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые
        работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от
        текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих
        сотрудников:
                Маша получает 67 760 рублей в месяц.
                Денис получает 83 690 рублей в месяц.
                Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после
        повышения.
        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей.
        Годовой доход вырос на ... рублей».*/
        System.out.println("Задача 7:");
/*
Видимо, тут задел стоит сделать на создание метода, раз о сотнях людей идет речь
 */
        float employerCurrentSalary = 67760F, employer2CurrentSalary = 83690F, employer3CurrentSalary = 76230F; //зарплата с копейками
        String employerName = "Маша", employer2Name = "Денис", employer3Name = "Кристина";
        float employerFutureSalary;
        employerFutureSalary = employerCurrentSalary * 1.1F;
        System.out.println(employerName + " теперь получает " + employerFutureSalary + " руб. Годовой доход вырос на " +
                (employerFutureSalary - employerCurrentSalary) * 12 + " руб.");
        employerFutureSalary = employer2CurrentSalary * 1.1F;
        System.out.println(employer2Name + " теперь получает " + employerFutureSalary + " руб. Годовой доход вырос на " +
                (employerFutureSalary - employer2CurrentSalary) * 12 + " руб.");
        employerFutureSalary = employer3CurrentSalary * 1.1F;
        System.out.println(employer3Name + " теперь получает " + employerFutureSalary + " руб. Годовой доход вырос на " +
                (employerFutureSalary - employer3CurrentSalary) * 12 + " руб.");
    }
}
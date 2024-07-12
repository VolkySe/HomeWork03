import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
    /*Задача 1
    Объявите переменные типа int, byte, short, long, float, double.
    Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
    Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        Integer intgr01 = 187654321;
        Byte bte01 = 22;
        Short shrt01 = 32000;
        /* long lng01 = 9100200300400500600; сообщение too large, почему? в подсказке было число чуть больше */
        Long lng01 = 4100200300400500600L;
        Float flt01 = 500800700600500400300200100000.1234567891011121314151617F;
        Double dble01 = 600800700600500400300200100000.123456789101112131417687687687687687687686876868767887687687687651617D;
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
        Float flt02A = 27.12F;
        String str02A = "987 678 965 549"; /* тут, пожалуй, должен существовать метод убирающий пробелы*/
        Long intg02 = Long.parseLong(str02A.replaceAll(" ", ""));
        /*нашел... https://sky.pro/media/udalenie-probelov-iz-stroki-v-java/ */
        /* System.out.println(intg02) я-прав */;
        Float flt02B = (float) 2.786F;
        String str02B = "2,786";
        /* а, значит, такое же должно существовать для запятой */
        Float flt02Bs = Float.parseFloat(str02B.replaceAll(",", "."));
        /* System.out.println(flt02Bs) неужели обязательно менять запятые на точки, чтобы конвертировать? */;
        Short shrt02A = 569;
        Short shrt02B = -159;
        Short shrt02C = 27897;
        Short shrt02D = 67;
    /*
    Задача 3
    Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
    У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
    Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов
    каждому ученику.
    Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
    Для объявления переменных не используйте тип var.
     */
        System.out.println("Задача 3:");
        Integer class01 = 23;
        Integer class02 = 27;
        Integer class03 = 30;
        Integer totalSheets = 480;
        System.out.println("На каждого ученика рассчитано по " + totalSheets/(class01 + class02 + class03) +
                " лист(a, ов) бумаги");

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
        Float controlTime = 2.0F; // used decimal, non mm:ss format
        Integer controlBottles = 1;
        Float minutesForBottleF = (float) (controlTime / controlBottles); /* машина производит целое количество бутылок,
        но время не обязательно кратно минутам по факту, нам нужно узнать, сколько времени понадобится
        на изготовление одной бутылки, то есть сколько времени на бутылку, но понадобится округление.
        UPD: нашёл https://sky.pro/media/preobrazovanie-tipov-s-float-v-int-v-java/ */
        System.out.println("За 20 минут машина произвела " + Math.round(20.0/minutesForBottleF)+ " шт. бутылок");
        System.out.println("За сутки машина произвела " + Math.round((24*60)/minutesForBottleF)+ " шт. бутылок");
        System.out.println("За три дня машина произвела " + Math.round((24*60*3)/minutesForBottleF)+ " шт. бутылок");
        /* https://sky.pro/wiki/java/poluchenie-kolichestva-dney-v-mesyatse-s-java-reshenie/#:~:text=out.-,println(%22%D0%9A%D0%BE%D0%BB%D0%B8%D1%87%D0%B5%D1%81%D1%82%D0%B2%D0%BE%20%D0%B4%D0%BD%D0%B5%D0%B9%20%D0%B2%20%D0%BC%D0%B5%D1%81%D1%8F%D1%86%D0%B5%3A%20%22%20%2B%20days),%D0%B1%D1%83%D0%B4%D0%B5%D1%82%20%D0%BA%D0%BE%D1%80%D1%80%D0%B5%D0%BA%D1%82%D0%BD%D0%BE%20%D1%83%D1%87%D0%B8%D1%82%D1%8B%D0%B2%D0%B0%D1%82%D1%8C%20%D0%B2%D0%B8%D1%81%D0%BE%D0%BA%D0%BE%D1%81%D0%BD%D1%8B%D0%B5%20%D0%B4%D0%BD%D0%B8. */
        Calendar daysPastMonth = Calendar.getInstance();
        daysPastMonth.add(Calendar.MONTH, -1); /* хто_знает чего это такое, пока что, но работает */
//        System.out.println(daysPastMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
// берём прошлый месяц, только он полностью завершён
        /* int daysInCurrentMonth = YearMonth. оказалось дольше разбираться */
        System.out.println("За прошлый месяц машина произвела " +
                Math.round((24*60*(daysPastMonth.getActualMaximum(Calendar.DAY_OF_MONTH)))/minutesForBottleF) +
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
        int totalRoomsCount = Math.round(totalCansCount/(whiteCansNeededPerRoom + brownCansNeededPerRoom));
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
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
                Результат в граммах и килограммах напечатайте в консоль.*/

        System.out.println("Задача 6:");
        int banans = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        float totalBreakfastWeight = banans + milk + iceCream + eggs;
        System.out.println("Вес такого спортзавтрака составляет " + totalBreakfastWeight + " гр. или " +
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
            (weightLossNeeded * 1000 / ((weightLossSpeedMin + weightLossSpeedMax) / 2) +  " дн."));

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
        float emplCurrentSalary = 67760F, empl2CurrentSalary = 83690F, empl3CurrentSalary = 76230F; //зарплата с копейками
        String emplName = "Маша", empl2Name = "Денис", empl3Name = "Кристина";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //задел на будущее
        LocalDate emplStartDay = LocalDate.parse("11.06.2023", formatter);
        LocalDate empl2StartDay = LocalDate.parse("17.07.2023", formatter);
        LocalDate empl3StartDay = LocalDate.parse("28.01.2009", formatter);
        Period period = Period.between(emplStartDay, LocalDate.now()); // что я делаю...
        int emplYears = period.getYears();
        period = Period.between(empl2StartDay, LocalDate.now());
        int empl2Years = period.getYears();
        period = Period.between(empl3StartDay, LocalDate.now());
        int empl3Years = period.getYears();
        //индексация пенсии за прошлый период
//        Чтобы узнать, какая сумма окажется на вкладе или накопительном счете через год, используйте формулу:
//        S = S0 × (1 + P / 100)^n, где S — финальная сумма вклада
//        S0 — начальная сумма вклада
//        P — процентная ставка с учетом капитализации
//        n — количество периодов, в которые банк начисляет проценты
//        Если вклад на год, то n = 1
        float emplFutureSalary;
        emplFutureSalary = (float) Math.pow(emplCurrentSalary * (1 + (10F / 100F)), emplYears);
        System.out.println(emplName + " теперь получает " + emplFutureSalary + " руб. Годовой доход вырос на " +
                (emplFutureSalary-emplCurrentSalary) * 12 + " руб.");
        emplFutureSalary = (float) Math.pow(empl2CurrentSalary * (1 + (10F / 100F)), empl2Years);
        System.out.println(empl2Name + " теперь получает " + emplFutureSalary + " руб. Годовой доход вырос на " +
                (emplFutureSalary-empl2CurrentSalary) * 12 + " руб.");
        emplFutureSalary = (float) Math.pow(empl3CurrentSalary * (1 + (10F / 100F)), empl3Years);
        System.out.println(empl3Name + " теперь получает " + emplFutureSalary + " руб. Годовой доход вырос на " +
                (emplFutureSalary-empl3CurrentSalary) * 12 + " руб.");
//работает, но нужно отладить аномалии
    }
}
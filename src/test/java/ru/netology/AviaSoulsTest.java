package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void compareMoreThanOneByPriceTest() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);

        int expected = 1;
        int actual = ticket2.compareTo(ticket1);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void compareLessThanOneByPriceTest() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);

        int expected = -1;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareZeroByPriceTest() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 10000, 9, 11);
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);

        int expected = 0;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchFewTicketsTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//1
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//2
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//5
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//3
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//4

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);

        Ticket[] expected = {ticket1, ticket2, ticket8, ticket10, ticket6};
        Ticket[] actual = aviasouls.search("Санкт - Петербург", "Москва");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchOneTicketTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//1
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//2
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//5
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//3
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//4

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);

        Ticket[] expected = {ticket5};
        Ticket[] actual = aviasouls.search("Лондон", "Шанхай");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchZeroTicketsTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//1
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//2
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//5
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//3
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//4

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);

        Ticket[] expected = {};
        Ticket[] actual = aviasouls.search("Сеул", "Омск");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchFewTicketsWithComparatorTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//2
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//8
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//16
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//14
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//14

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1, ticket2, ticket8, ticket10, ticket6};
        Ticket[] actual = aviasouls.search("Санкт - Петербург", "Москва", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchOneTicketWithComparatorTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//2
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//8
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//16
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//14
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//14

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = aviasouls.search("Лондон", "Шанхай", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchZeroTicketsWithComparatorTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//2
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//8
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//16
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//14
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//14

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = aviasouls.search("Сеул", "Омск", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAndSortByTimeTest() {
        AviaSouls aviasouls = new AviaSouls();

        Ticket ticket1 = new Ticket("Санкт - Петербург", "Москва", 3000, 9, 11);//2
        Ticket ticket2 = new Ticket("Санкт - Петербург", "Москва", 10000, 2, 10);//8
        Ticket ticket3 = new Ticket("Сеул", "Дели", 15000, 5, 22);
        Ticket ticket4 = new Ticket("Бангкок", "Токио", 12000, 1, 21);
        Ticket ticket5 = new Ticket("Лондон", "Шанхай", 25000, 4, 16);
        Ticket ticket6 = new Ticket("Санкт - Петербург", "Москва", 21000, 7, 23);//16
        Ticket ticket7 = new Ticket("Стамбул", "Санкт - Петербург", 16000, 8, 14);
        Ticket ticket8 = new Ticket("Санкт - Петербург", "Москва", 11000, 3, 17);//14
        Ticket ticket9 = new Ticket("Владивосток", "Иркутск", 7000, 6, 12);
        Ticket ticket10 = new Ticket("Санкт - Петербург", "Москва", 19000, 10, 24);//14

        aviasouls.add(ticket1);
        aviasouls.add(ticket2);
        aviasouls.add(ticket3);
        aviasouls.add(ticket4);
        aviasouls.add(ticket5);
        aviasouls.add(ticket6);
        aviasouls.add(ticket7);
        aviasouls.add(ticket8);
        aviasouls.add(ticket9);
        aviasouls.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1, ticket2, ticket8, ticket10, ticket6};
        Ticket[] actual = aviasouls.searchAndSortByTime("Санкт - Петербург", "Москва", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}

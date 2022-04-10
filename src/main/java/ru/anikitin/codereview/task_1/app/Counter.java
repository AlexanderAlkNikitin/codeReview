package ru.anikitin.codereview.task_1.app;


/**
 * Счетчик
 *
 * @param <T> тип считаемых данных
 */
public interface Counter<T> {

    /**
     * Добавление элемента для подсчета
     *
     * @param o элемент для подсчета
     */
    void add(T o);

    /**
     * Получение кол-ва элементов
     *
     * @return кол-во элементов
     */
    int getCount();
}

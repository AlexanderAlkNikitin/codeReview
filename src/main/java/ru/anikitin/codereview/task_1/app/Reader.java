package ru.anikitin.codereview.task_1.app;

import java.io.IOException;

/**
 * Сервис для чтения файла
 *
 * @param <T> Тип читаемых данных
 */
public interface Reader<T> {

    /**
     * Открыть файл для чтения
     * @param fileName имя файла
     */
    void open(String fileName)throws IOException;

    /**
     * Чтение из файла
     *
     * @return полученные данные из файла
     */
    T read();

    /**
     * Проверка возможности чтения
     *
     * @return результат проверки
     */
    boolean canRead();
}

package sa.ovodkov.librarian.service;

import sa.ovodkov.librarian.entity.Category;

import java.util.List;

/**
 * Сервис для работы с категориями книг.
 */
public interface CategoryService {

    /**
     * Получить список верхне уровневых категорий.
     *
     * @return Список верхне уровневых категорий.
     */
    List<Category> getRootCategory();
}

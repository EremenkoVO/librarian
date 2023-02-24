package sa.ovodkov.librarian.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sa.ovodkov.librarian.dto.CategoryDTO;
import sa.ovodkov.librarian.entity.Category;
import sa.ovodkov.librarian.repository.CategoryRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getRootCategory() {
        return categoryRepository.findByParentCategoryIsNull();
    }

    @Override
    public void addCategory(CategoryDTO category) {
        Category newCategory = Category.builder()
            .name(category.getName())
            .description(category.getDescription())
            .build();
        if (category.getParentId() != null) {
            categoryRepository.findById(category.getParentId()).ifPresent(newCategory::setParentCategory);
        }
    }
}

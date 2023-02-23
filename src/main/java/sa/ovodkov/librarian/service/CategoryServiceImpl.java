package sa.ovodkov.librarian.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sa.ovodkov.librarian.entity.Category;
import sa.ovodkov.librarian.repository.CategoryRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getRootCategory() {
        return categoryRepository.findByParentCategoryIsNull();
    }
}

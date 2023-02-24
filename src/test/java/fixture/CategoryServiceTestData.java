package fixture;

import sa.ovodkov.librarian.dto.CategoryDTO;
import sa.ovodkov.librarian.entity.Category;

public class CategoryServiceTestData {

    public static CategoryDTO getCategoryDTOWithoutParentCategory() {
        return CategoryDTO.builder().name("Test").description("Test description").build();
    }

    public static CategoryDTO getCategoryDTOWithParentCategory(Long parentCategoryId) {
        CategoryDTO categoryDTO = getCategoryDTOWithoutParentCategory();
        categoryDTO.setParentId(parentCategoryId);
        return categoryDTO;
    }

    public static Category getParentCategory(Long id) {
        return Category.builder()
            .id(id)
            .name("Parent category")
            .description("Parent category description")
            .build();
    }
}

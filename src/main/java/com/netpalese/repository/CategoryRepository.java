package com.netpalese.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.netpalese.domain.entity.Category;

@Repository
public class CategoryRepository extends AbstractRepository<Category> {

	
	public Category getCategory(String name) {
		return executeNamedQueryUniqueResult("getCategoryByName", "name", name);
	}
	
	public List<Category> getCategories(List<String> names) {
		return executeNamedQuery("getCategoriesByNames", "names", names);
	}
}

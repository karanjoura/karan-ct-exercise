package handson.impl;

import java.util.Locale;
import java.util.concurrent.CompletionStage;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.products.Product;
import io.sphere.sdk.products.ProductProjection;
import io.sphere.sdk.products.ProductProjectionType;
import io.sphere.sdk.queries.PagedQueryResult;

/**
 * This class provides query operations for {@link ProductProjection}s.
 */
public class ProductQueryService extends AbstractService {

	public ProductQueryService(SphereClient client) {
		super(client);
	}

	/**
	 * @param locale
	 * @param name
	 * @return
	 */
	private CompletionStage<PagedQueryResult<Category>> findCategory(final Locale locale, final String name) {
		// TODO 4.1 Find a category

		CompletionStage<PagedQueryResult<Category>> category = client.execute(CategoryQuery.of().byName(locale, name));
		return category;
	}

	/**
	 * Queries product projections that belong to given category
	 * 
	 * @param category
	 * @return Paged result of Product projections
	 */
	private CompletionStage<PagedQueryResult<ProductProjection>> withCategory(final Category category) {
		// TODO 4.2 Query a category\

		return null;
	}

	/**
	 * Finds products with categories that have the given localized name.
	 *
	 * @param locale
	 *            the locale
	 * @param name
	 *            the localized name
	 * @return the product query completion stage
	 */
	public CompletionStage<PagedQueryResult<ProductProjection>> findProductsWithCategory(final Locale locale,
			final String name) {

		CompletionStage<PagedQueryResult<Category>> category = findCategory(locale, name);
		

		return null;
		// TODO 4.3 Find a product with category

	}

}

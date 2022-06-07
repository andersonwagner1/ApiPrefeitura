package br.com.prefeitura.diadema.repository;
//@Repository
public class CustomRestaurantRepositoryImpl /*implements CustomRestaurantRepository */{
/*
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Restaurant> advancedSearch(AdvancedSearch advancedSearch) {

        var jpql = new StringBuilder();
        jpql.append("from Restaurant where 1=1 ");

        var parameters = new HashMap<String, Object>();

        if (StringUtils.hasLength(advancedSearch.getName())) {
            jpql.append("and name like :name ");
            parameters.put("name", "%" + advancedSearch.getName() + "%");
        }

        if (StringUtils.hasLength(advancedSearch.getAddress())) {
            jpql.append("and address like :address ");
            parameters.put("address", "%" + advancedSearch.getAddress() + "%");
        }

        if (advancedSearch.getMinDeliveryFee() != null) {
            jpql.append("and deliveryFee >= :startFee ");
            parameters.put("startFee", advancedSearch.getMinDeliveryFee());
        }

        if (advancedSearch.getMaxDeliveryFee() != null) {
            jpql.append("and deliveryFee <= :endingFee ");
            parameters.put("endingFee", advancedSearch.getMaxDeliveryFee());
        }

        if (StringUtils.hasLength(advancedSearch.getCuisine())) {
            jpql.append("and cuisine.name like :cuisine ");
            parameters.put("cuisine", "%" + advancedSearch.getCuisine() + "%");
        }

        if (StringUtils.hasLength(advancedSearch.getCity())) {
            jpql.append("and city like :city ");
            parameters.put("city", "%" + advancedSearch.getCity() + "%");
        }

        TypedQuery<Restaurant> query = entityManager.createQuery(jpql.toString(), Restaurant.class);

        parameters.forEach((key, value) -> query.setParameter(key, value));

        return query.getResultList();
    }*/
}
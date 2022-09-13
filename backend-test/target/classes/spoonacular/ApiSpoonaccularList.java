package spoonacular;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiSpoonaccularList{
    ShoppingList shoppingList = new ShoppingList();

    @GET("/mealplanner/\" + shoppingList.getUser() + \"/shopping-list/items")
    Call<ApiShoppingResultGetList> findRecipesGet(
            @Query("apiKey") String apiKey,
            @Query("hash") String hash,
            @Query("username") String username
    );

    @POST("/mealplanner/\" + shoppingList.getUser() + \"/shopping-list/items")
    Call<ApiShoppingResultAddList> connect(@Body ApiShoppingResultAddList request,
                                           @Query("apiKey") String apiKey,
                                           @Query("hash") String hash,
                                           @Query("username") String username
    );
}

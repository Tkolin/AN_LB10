package DataBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TypeFurnitureDao {
    @Query("SELECT * FROM TypeFurniture")
    List<TypeFurniture> getAll();


    @Insert
    void insertAll(TypeFurniture... typeFurnitures);

    @Delete
    void delete(TypeFurniture typeFurniture);
}

package DataBase;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FurnitureDao {
    @Query("SELECT * FROM Furniture")
    List<Furniture> getAll();

    @Insert
    void insertAll(Furniture... furnitures);

    @Delete
    void delete(Furniture furnitur);
}

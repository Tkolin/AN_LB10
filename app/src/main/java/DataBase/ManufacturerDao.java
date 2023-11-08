package DataBase;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ManufacturerDao {
    @Query("SELECT * FROM Manufacturer")
    List<Manufacturer> getAll();


    @Insert
    void insertAll(Manufacturer... manufacturers);

    @Delete
    void delete(Manufacturer manufacturer);
}

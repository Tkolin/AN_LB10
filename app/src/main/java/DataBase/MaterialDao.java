package DataBase;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MaterialDao {
    @Query("SELECT * FROM Material")
    List<Material> getAll();


    @Insert
    void insertAll(Material... materials);

    @Delete
    void delete(Material material);
}

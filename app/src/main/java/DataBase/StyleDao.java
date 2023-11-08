package DataBase;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StyleDao {
    @Query("SELECT * FROM Style")
    List<Style> getAll();


    @Insert
    void insertAll(Style... styles);

    @Delete
    void delete(Style style);
}

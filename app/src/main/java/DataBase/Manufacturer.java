package DataBase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Manufacturer {
    @PrimaryKey(autoGenerate = true)
    public int ID;

    @ColumnInfo(name = "name")
    public String name;
}

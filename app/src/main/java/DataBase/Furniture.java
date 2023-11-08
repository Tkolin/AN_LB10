package DataBase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Furniture {
    @PrimaryKey(autoGenerate = true)
    public int ID;

    @ColumnInfo(name = "height")
    public float height;

    @ColumnInfo(name = "width")
    public float width;
    @ColumnInfo(name = "weight")
    public float weight;

    @ColumnInfo(name = "materialID")
    public int materialID;
    @ColumnInfo(name = "manufacturerID")
    public int manufacturerID;
    @ColumnInfo(name = "styleID")
    public int styleID;
    @ColumnInfo(name = "typeFurnitureID")
    public int typeFurnitureID;
}

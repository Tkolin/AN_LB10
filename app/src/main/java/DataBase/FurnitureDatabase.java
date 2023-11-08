package DataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {
        Furniture.class,
        Manufacturer.class,
        Material.class,
        Style.class,
        TypeFurniture.class
}, version = 1)
public abstract class FurnitureDatabase extends  RoomDatabase {
   public  abstract FurnitureDao furnitureDao();
    public  abstract MaterialDao materialDao();
    public  abstract TypeFurnitureDao typeFurnitureDao();
    public  abstract ManufacturerDao manufacturerDao();
    public  abstract StyleDao styleDao();
}

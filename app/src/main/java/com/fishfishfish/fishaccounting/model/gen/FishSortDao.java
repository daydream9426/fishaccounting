package com.fishfishfish.fishaccounting.model.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.fishfishfish.fishaccounting.model.bean.local.FishSort;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "FISH_SORT".
 */
public class FishSortDao extends AbstractDao<FishSort, Long> {

    public static final String TABLENAME = "FISH_SORT";

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FISH_SORT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SORT_NAME\" TEXT," + // 1: sortName
                "\"SORT_IMG\" TEXT," + // 2: sortImg
                "\"COST\" REAL NOT NULL ," + // 3: cost
                "\"INCOME\" INTEGER);"); // 4: income
    }


    public FishSortDao(DaoConfig config) {
        super(config);
    }

    public FishSortDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FISH_SORT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FishSort entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(2, sortName);
        }

        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(3, sortImg);
        }
        stmt.bindDouble(4, entity.getCost());

        Boolean income = entity.getIncome();
        if (income != null) {
            stmt.bindLong(5, income ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FishSort entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(2, sortName);
        }

        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(3, sortImg);
        }
        stmt.bindDouble(4, entity.getCost());

        Boolean income = entity.getIncome();
        if (income != null) {
            stmt.bindLong(5, income ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    public FishSort readEntity(Cursor cursor, int offset) {
        FishSort entity = new FishSort( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // sortName
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // sortImg
                cursor.getFloat(offset + 3), // cost
                cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0 // income
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, FishSort entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSortName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSortImg(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCost(cursor.getFloat(offset + 3));
        entity.setIncome(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
     }
     
    @Override
    public Long getKey(FishSort entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final Long updateKeyAfterInsert(FishSort entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * Properties of entity FishSort.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SortName = new Property(1, String.class, "sortName", false, "SORT_NAME");
        public final static Property SortImg = new Property(2, String.class, "sortImg", false, "SORT_IMG");
        public final static Property Cost = new Property(3, float.class, "cost", false, "COST");
        public final static Property Income = new Property(4, Boolean.class, "income", false, "INCOME");
    }

    @Override
    public boolean hasKey(FishSort entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

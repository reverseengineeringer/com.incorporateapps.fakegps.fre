package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DB
{
  private SQLiteDatabase a;
  private final Context b;
  private h c;
  
  public DB(Context paramContext)
  {
    b = paramContext;
    c = new h(b, "FakeGPSInc.db");
  }
  
  public final DB a()
  {
    a = c.getWritableDatabase();
    return this;
  }
  
  public final void b()
  {
    if (a.isOpen()) {
      a.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.DB
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
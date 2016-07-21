package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;

final class h
  extends SQLiteOpenHelper
{
  public h(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private static String a(List paramList, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return localStringBuilder.toString();
      }
      if (i != 0) {
        localStringBuilder.append(paramString);
      }
      localStringBuilder.append((String)paramList.get(i));
      i += 1;
    }
  }
  
  /* Error */
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_0
    //   6: new 14	java/lang/StringBuilder
    //   9: dup
    //   10: ldc 42
    //   12: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc 47
    //   21: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 27	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: aconst_null
    //   28: invokevirtual 53	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_0
    //   32: aload_0
    //   33: ifnull +24 -> 57
    //   36: aload_0
    //   37: astore_2
    //   38: new 55	java/util/ArrayList
    //   41: dup
    //   42: aload_0
    //   43: invokeinterface 61 1 0
    //   48: invokestatic 67	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   51: invokespecial 70	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   54: astore_3
    //   55: aload_3
    //   56: astore_2
    //   57: aload_2
    //   58: astore_1
    //   59: aload_0
    //   60: ifnull +11 -> 71
    //   63: aload_0
    //   64: invokeinterface 73 1 0
    //   69: aload_2
    //   70: astore_1
    //   71: aload_1
    //   72: areturn
    //   73: astore_3
    //   74: aconst_null
    //   75: astore_0
    //   76: aload_0
    //   77: astore_2
    //   78: aload_1
    //   79: aload_3
    //   80: invokevirtual 76	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   83: aload_3
    //   84: invokestatic 82	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aload_0
    //   89: astore_2
    //   90: aload_3
    //   91: invokevirtual 85	java/lang/Exception:printStackTrace	()V
    //   94: aload 4
    //   96: astore_1
    //   97: aload_0
    //   98: ifnull -27 -> 71
    //   101: aload_0
    //   102: invokeinterface 73 1 0
    //   107: aconst_null
    //   108: areturn
    //   109: astore_0
    //   110: aconst_null
    //   111: astore_2
    //   112: aload_2
    //   113: ifnull +9 -> 122
    //   116: aload_2
    //   117: invokeinterface 73 1 0
    //   122: aload_0
    //   123: athrow
    //   124: astore_0
    //   125: goto -13 -> 112
    //   128: astore_3
    //   129: goto -53 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	132	1	paramString	String
    //   4	113	2	localObject1	Object
    //   54	2	3	localArrayList	java.util.ArrayList
    //   73	18	3	localException1	Exception
    //   128	1	3	localException2	Exception
    //   1	94	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   5	32	73	java/lang/Exception
    //   5	32	109	finally
    //   38	55	124	finally
    //   78	88	124	finally
    //   90	94	124	finally
    //   38	55	128	java/lang/Exception
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table History (_id integer primary key autoincrement, Address  text default null ,Lon real default 0.0,Lat real default 0.0,Flag integer default 0);");
  }
  
  /* Error */
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: ldc 96
    //   5: new 14	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 98
    //   11: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: iload_2
    //   15: invokevirtual 101	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   18: ldc 103
    //   20: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: iload_3
    //   24: invokevirtual 101	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: ldc 105
    //   29: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 27	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokestatic 109	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   38: pop
    //   39: iload_2
    //   40: iload_3
    //   41: if_icmpge +188 -> 229
    //   44: aload_1
    //   45: invokevirtual 112	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   48: aload_1
    //   49: new 14	java/lang/StringBuilder
    //   52: dup
    //   53: ldc 114
    //   55: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: ldc 116
    //   60: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: ldc 118
    //   65: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 27	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: aconst_null
    //   72: invokevirtual 53	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 5
    //   77: aload 5
    //   79: ifnull +151 -> 230
    //   82: aload 5
    //   84: invokeinterface 121 1 0
    //   89: ifle +141 -> 230
    //   92: iload 4
    //   94: istore_2
    //   95: iload_2
    //   96: ifeq +139 -> 235
    //   99: aload_1
    //   100: ldc 116
    //   102: invokestatic 123	com/incorporateapps/fakegps/fre/h:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/List;
    //   105: astore 5
    //   107: aload_1
    //   108: new 14	java/lang/StringBuilder
    //   111: dup
    //   112: ldc 125
    //   114: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: ldc 116
    //   119: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc 127
    //   124: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc 116
    //   129: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 27	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokevirtual 92	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   138: aload_1
    //   139: ldc 89
    //   141: invokevirtual 92	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   144: aload 5
    //   146: aload_1
    //   147: ldc 116
    //   149: invokestatic 123	com/incorporateapps/fakegps/fre/h:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/List;
    //   152: invokeinterface 131 2 0
    //   157: pop
    //   158: aload 5
    //   160: ldc -123
    //   162: invokestatic 135	com/incorporateapps/fakegps/fre/h:a	(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   165: astore 5
    //   167: aload_1
    //   168: ldc -119
    //   170: iconst_4
    //   171: anewarray 139	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: ldc 116
    //   178: aastore
    //   179: dup
    //   180: iconst_1
    //   181: aload 5
    //   183: aastore
    //   184: dup
    //   185: iconst_2
    //   186: aload 5
    //   188: aastore
    //   189: dup
    //   190: iconst_3
    //   191: ldc 116
    //   193: aastore
    //   194: invokestatic 143	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   197: invokevirtual 92	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   200: aload_1
    //   201: new 14	java/lang/StringBuilder
    //   204: dup
    //   205: ldc -111
    //   207: invokespecial 45	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: ldc 116
    //   212: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: invokevirtual 27	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokevirtual 92	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   221: aload_1
    //   222: invokevirtual 148	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   225: aload_1
    //   226: invokevirtual 151	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   229: return
    //   230: iconst_0
    //   231: istore_2
    //   232: goto -137 -> 95
    //   235: aload_1
    //   236: ldc 89
    //   238: invokevirtual 92	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   241: goto -20 -> 221
    //   244: astore 5
    //   246: aload_1
    //   247: invokevirtual 151	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   250: aload 5
    //   252: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	h
    //   0	253	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	253	2	paramInt1	int
    //   0	253	3	paramInt2	int
    //   1	92	4	i	int
    //   75	112	5	localObject1	Object
    //   244	7	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   48	77	244	finally
    //   82	92	244	finally
    //   99	221	244	finally
    //   221	225	244	finally
    //   235	241	244	finally
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
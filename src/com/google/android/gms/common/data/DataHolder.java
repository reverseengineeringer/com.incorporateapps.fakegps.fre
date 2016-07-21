package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DataHolder
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  private static final DataHolder.zza zzajq = new DataHolder.1(new String[0], null);
  boolean mClosed = false;
  private final int mVersionCode;
  private final int zzade;
  private final String[] zzaji;
  Bundle zzajj;
  private final CursorWindow[] zzajk;
  private final Bundle zzajl;
  int[] zzajm;
  int zzajn;
  private Object zzajo;
  private boolean zzajp = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    mVersionCode = paramInt1;
    zzaji = paramArrayOfString;
    zzajk = paramArrayOfCursorWindow;
    zzade = paramInt2;
    zzajl = paramBundle;
  }
  
  private DataHolder(DataHolder.zza paramzza, int paramInt, Bundle paramBundle)
  {
    this(DataHolder.zza.zza(paramzza), zza(paramzza, -1), paramInt, paramBundle);
  }
  
  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    mVersionCode = 1;
    zzaji = ((String[])zzx.zzz(paramArrayOfString));
    zzajk = ((CursorWindow[])zzx.zzz(paramArrayOfCursorWindow));
    zzade = paramInt;
    zzajl = paramBundle;
    zzqd();
  }
  
  public static DataHolder zza(int paramInt, Bundle paramBundle)
  {
    return new DataHolder(zzajq, paramInt, paramBundle);
  }
  
  private static CursorWindow[] zza(DataHolder.zza paramzza, int paramInt)
  {
    int k = 0;
    if (DataHolder.zza.zza(paramzza).length == 0) {
      return new CursorWindow[0];
    }
    Object localObject3;
    Object localObject2;
    ArrayList localArrayList;
    int i;
    label88:
    Object localObject1;
    if ((paramInt < 0) || (paramInt >= DataHolder.zza.zzb(paramzza).size()))
    {
      localObject3 = DataHolder.zza.zzb(paramzza);
      int m = ((List)localObject3).size();
      localObject2 = new CursorWindow(false);
      localArrayList = new ArrayList();
      localArrayList.add(localObject2);
      ((CursorWindow)localObject2).setNumColumns(DataHolder.zza.zza(paramzza).length);
      paramInt = 0;
      i = 0;
      if (paramInt >= m) {
        break label684;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      int j;
      try
      {
        if (!((CursorWindow)localObject2).allocRow())
        {
          Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + paramInt + ")");
          localObject2 = new CursorWindow(false);
          ((CursorWindow)localObject2).setStartPosition(paramInt);
          ((CursorWindow)localObject2).setNumColumns(DataHolder.zza.zza(paramzza).length);
          localArrayList.add(localObject2);
          localObject1 = localObject2;
          if (!((CursorWindow)localObject2).allocRow())
          {
            Log.e("DataHolder", "Unable to allocate row to hold data.");
            localArrayList.remove(localObject2);
            paramzza = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
            return paramzza;
            localObject3 = DataHolder.zza.zzb(paramzza).subList(0, paramInt);
            break;
          }
        }
        localObject2 = (Map)((List)localObject3).get(paramInt);
        j = 0;
        bool = true;
        if ((j < DataHolder.zza.zza(paramzza).length) && (bool))
        {
          String str = DataHolder.zza.zza(paramzza)[j];
          Object localObject4 = ((Map)localObject2).get(str);
          if (localObject4 == null)
          {
            bool = ((CursorWindow)localObject1).putNull(paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof String))
          {
            bool = ((CursorWindow)localObject1).putString((String)localObject4, paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof Long))
          {
            bool = ((CursorWindow)localObject1).putLong(((Long)localObject4).longValue(), paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof Integer))
          {
            bool = ((CursorWindow)localObject1).putLong(((Integer)localObject4).intValue(), paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof Boolean))
          {
            if (!((Boolean)localObject4).booleanValue()) {
              break label708;
            }
            l = 1L;
            bool = ((CursorWindow)localObject1).putLong(l, paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof byte[]))
          {
            bool = ((CursorWindow)localObject1).putBlob((byte[])localObject4, paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof Double))
          {
            bool = ((CursorWindow)localObject1).putDouble(((Double)localObject4).doubleValue(), paramInt, j);
            break label701;
          }
          if ((localObject4 instanceof Float))
          {
            bool = ((CursorWindow)localObject1).putDouble(((Float)localObject4).floatValue(), paramInt, j);
            break label701;
          }
          throw new IllegalArgumentException("Unsupported object for column " + str + ": " + localObject4);
        }
      }
      catch (RuntimeException paramzza)
      {
        boolean bool;
        i = localArrayList.size();
        paramInt = k;
        if (paramInt < i)
        {
          ((CursorWindow)localArrayList.get(paramInt)).close();
          paramInt += 1;
          continue;
          if (!bool)
          {
            if (i != 0) {
              throw new DataHolder.zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
            }
            Log.d("DataHolder", "Couldn't populate window data for row " + paramInt + " - allocating new window.");
            ((CursorWindow)localObject1).freeLastRow();
            localObject1 = new CursorWindow(false);
            ((CursorWindow)localObject1).setStartPosition(paramInt);
            ((CursorWindow)localObject1).setNumColumns(DataHolder.zza.zza(paramzza).length);
            localArrayList.add(localObject1);
            i = paramInt - 1;
            paramInt = 1;
            j = paramInt;
            paramInt = i + 1;
            localObject2 = localObject1;
            i = j;
            break label88;
          }
          j = 0;
          i = paramInt;
          paramInt = j;
          continue;
        }
        throw paramzza;
      }
      label684:
      return (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
      label701:
      j += 1;
      continue;
      label708:
      long l = 0L;
    }
  }
  
  public static DataHolder zzbI(int paramInt)
  {
    return zza(paramInt, null);
  }
  
  private void zzg(String paramString, int paramInt)
  {
    if ((zzajj == null) || (!zzajj.containsKey(paramString))) {
      throw new IllegalArgumentException("No such column: " + paramString);
    }
    if (isClosed()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((paramInt < 0) || (paramInt >= zzajn)) {
      throw new CursorIndexOutOfBoundsException(paramInt, zzajn);
    }
  }
  
  public final void close()
  {
    try
    {
      if (!mClosed)
      {
        mClosed = true;
        int i = 0;
        while (i < zzajk.length)
        {
          zzajk[i].close();
          i += 1;
        }
      }
      return;
    }
    finally {}
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 53	com/google/android/gms/common/data/DataHolder:zzajp	Z
    //   4: ifeq +79 -> 83
    //   7: aload_0
    //   8: getfield 59	com/google/android/gms/common/data/DataHolder:zzajk	[Landroid/database/CursorWindow;
    //   11: arraylength
    //   12: ifle +71 -> 83
    //   15: aload_0
    //   16: invokevirtual 274	com/google/android/gms/common/data/DataHolder:isClosed	()Z
    //   19: ifne +64 -> 83
    //   22: aload_0
    //   23: getfield 287	com/google/android/gms/common/data/DataHolder:zzajo	Ljava/lang/Object;
    //   26: ifnonnull +62 -> 88
    //   29: new 127	java/lang/StringBuilder
    //   32: dup
    //   33: ldc_w 289
    //   36: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: aload_0
    //   40: invokevirtual 290	java/lang/Object:toString	()Ljava/lang/String;
    //   43: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_1
    //   50: ldc_w 292
    //   53: new 127	java/lang/StringBuilder
    //   56: dup
    //   57: ldc_w 294
    //   60: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: aload_1
    //   64: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc -118
    //   69: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokestatic 160	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   78: pop
    //   79: aload_0
    //   80: invokevirtual 295	com/google/android/gms/common/data/DataHolder:close	()V
    //   83: aload_0
    //   84: invokespecial 297	java/lang/Object:finalize	()V
    //   87: return
    //   88: aload_0
    //   89: getfield 287	com/google/android/gms/common/data/DataHolder:zzajo	Ljava/lang/Object;
    //   92: invokevirtual 290	java/lang/Object:toString	()Ljava/lang/String;
    //   95: astore_1
    //   96: goto -46 -> 50
    //   99: astore_1
    //   100: aload_0
    //   101: invokespecial 297	java/lang/Object:finalize	()V
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	DataHolder
    //   49	47	1	str	String
    //   99	6	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	50	99	finally
    //   50	83	99	finally
    //   88	96	99	finally
  }
  
  public final int getCount()
  {
    return zzajn;
  }
  
  public final int getStatusCode()
  {
    return zzade;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean isClosed()
  {
    try
    {
      boolean bool = mClosed;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public final void zza(String paramString, int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    zzg(paramString, paramInt1);
    zzajk[paramInt2].copyStringToBuffer(paramInt1, zzajj.getInt(paramString), paramCharArrayBuffer);
  }
  
  public final long zzb(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].getLong(paramInt1, zzajj.getInt(paramString));
  }
  
  public final int zzbH(int paramInt)
  {
    int j = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < zzajn))
    {
      bool = true;
      zzx.zzab(bool);
    }
    for (;;)
    {
      int i = j;
      if (j < zzajm.length)
      {
        if (paramInt < zzajm[j]) {
          i = j - 1;
        }
      }
      else
      {
        paramInt = i;
        if (i == zzajm.length) {
          paramInt = i - 1;
        }
        return paramInt;
        bool = false;
        break;
      }
      j += 1;
    }
  }
  
  public final int zzc(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].getInt(paramInt1, zzajj.getInt(paramString));
  }
  
  public final boolean zzcz(String paramString)
  {
    return zzajj.containsKey(paramString);
  }
  
  public final String zzd(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].getString(paramInt1, zzajj.getInt(paramString));
  }
  
  public final boolean zze(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return Long.valueOf(zzajk[paramInt2].getLong(paramInt1, zzajj.getInt(paramString))).longValue() == 1L;
  }
  
  public final float zzf(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].getFloat(paramInt1, zzajj.getInt(paramString));
  }
  
  public final byte[] zzg(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].getBlob(paramInt1, zzajj.getInt(paramString));
  }
  
  public final Uri zzh(String paramString, int paramInt1, int paramInt2)
  {
    paramString = zzd(paramString, paramInt1, paramInt2);
    if (paramString == null) {
      return null;
    }
    return Uri.parse(paramString);
  }
  
  public final boolean zzi(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    return zzajk[paramInt2].isNull(paramInt1, zzajj.getInt(paramString));
  }
  
  public final Bundle zzpZ()
  {
    return zzajl;
  }
  
  public final void zzqd()
  {
    int j = 0;
    zzajj = new Bundle();
    int i = 0;
    while (i < zzaji.length)
    {
      zzajj.putInt(zzaji[i], i);
      i += 1;
    }
    zzajm = new int[zzajk.length];
    int k = 0;
    i = j;
    j = k;
    while (i < zzajk.length)
    {
      zzajm[i] = j;
      k = zzajk[i].getStartPosition();
      j += zzajk[i].getNumRows() - (j - k);
      i += 1;
    }
    zzajn = j;
  }
  
  final String[] zzqe()
  {
    return zzaji;
  }
  
  final CursorWindow[] zzqf()
  {
    return zzajk;
  }
  
  public final void zzu(Object paramObject)
  {
    zzajo = paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
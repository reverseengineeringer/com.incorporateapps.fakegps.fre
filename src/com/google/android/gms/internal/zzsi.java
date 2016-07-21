package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class zzsi
{
  private static int zza(String paramString, zzsj.zza.zza[] paramArrayOfzza)
  {
    int m = paramArrayOfzza.length;
    int i = 0;
    int j = 14;
    if (i < m)
    {
      zzsj.zza.zza localzza = paramArrayOfzza[i];
      int k;
      if (j == 14) {
        if ((type == 9) || (type == 2) || (type == 6)) {
          k = type;
        }
      }
      do
      {
        do
        {
          i += 1;
          j = k;
          break;
          k = j;
        } while (type == 14);
        throw new IllegalArgumentException("Unexpected TypedValue type: " + type + " for key " + paramString);
        k = j;
      } while (type == j);
      throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + paramString + " contains items of type " + j + " and " + type);
    }
    return j;
  }
  
  static int zza(List paramList, Asset paramAsset)
  {
    paramList.add(paramAsset);
    return paramList.size() - 1;
  }
  
  public static zzsi.zza zza(DataMap paramDataMap)
  {
    zzsj localzzsj = new zzsj();
    ArrayList localArrayList = new ArrayList();
    zzbtA = zza(paramDataMap, localArrayList);
    return new zzsi.zza(localzzsj, localArrayList);
  }
  
  private static zzsj.zza.zza zza(List paramList, Object paramObject)
  {
    zzsj.zza.zza localzza1 = new zzsj.zza.zza();
    if (paramObject == null)
    {
      type = 14;
      return localzza1;
    }
    zzbtE = new zzsj.zza.zza.zza();
    if ((paramObject instanceof String))
    {
      type = 2;
      zzbtE.zzbtG = ((String)paramObject);
    }
    Object localObject2;
    Object localObject1;
    int i;
    Object localObject3;
    for (;;)
    {
      return localzza1;
      if ((paramObject instanceof Integer))
      {
        type = 6;
        zzbtE.zzbtK = ((Integer)paramObject).intValue();
      }
      else if ((paramObject instanceof Long))
      {
        type = 5;
        zzbtE.zzbtJ = ((Long)paramObject).longValue();
      }
      else if ((paramObject instanceof Double))
      {
        type = 3;
        zzbtE.zzbtH = ((Double)paramObject).doubleValue();
      }
      else if ((paramObject instanceof Float))
      {
        type = 4;
        zzbtE.zzbtI = ((Float)paramObject).floatValue();
      }
      else if ((paramObject instanceof Boolean))
      {
        type = 8;
        zzbtE.zzbtM = ((Boolean)paramObject).booleanValue();
      }
      else if ((paramObject instanceof Byte))
      {
        type = 7;
        zzbtE.zzbtL = ((Byte)paramObject).byteValue();
      }
      else if ((paramObject instanceof byte[]))
      {
        type = 1;
        zzbtE.zzbtF = ((byte[])paramObject);
      }
      else if ((paramObject instanceof String[]))
      {
        type = 11;
        zzbtE.zzbtP = ((String[])paramObject);
      }
      else if ((paramObject instanceof long[]))
      {
        type = 12;
        zzbtE.zzbtQ = ((long[])paramObject);
      }
      else if ((paramObject instanceof float[]))
      {
        type = 15;
        zzbtE.zzbtR = ((float[])paramObject);
      }
      else if ((paramObject instanceof Asset))
      {
        type = 13;
        zzbtE.zzbtS = zza(paramList, (Asset)paramObject);
      }
      else
      {
        if (!(paramObject instanceof DataMap)) {
          break;
        }
        type = 9;
        paramObject = (DataMap)paramObject;
        localObject2 = new TreeSet(((DataMap)paramObject).keySet());
        localObject1 = new zzsj.zza[((TreeSet)localObject2).size()];
        localObject2 = ((TreeSet)localObject2).iterator();
        i = 0;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject1[i] = new zzsj.zza();
          name = ((String)localObject3);
          zzbtC = zza(paramList, ((DataMap)paramObject).get((String)localObject3));
          i += 1;
        }
        zzbtE.zzbtN = ((zzsj.zza[])localObject1);
      }
    }
    int j;
    label575:
    zzsj.zza.zza localzza2;
    if ((paramObject instanceof ArrayList))
    {
      type = 10;
      localObject2 = (ArrayList)paramObject;
      localObject3 = new zzsj.zza.zza[((ArrayList)localObject2).size()];
      paramObject = null;
      int k = ((ArrayList)localObject2).size();
      j = 0;
      i = 14;
      if (j < k)
      {
        localObject1 = ((ArrayList)localObject2).get(j);
        localzza2 = zza(paramList, localObject1);
        if ((type != 14) && (type != 2) && (type != 6) && (type != 9)) {
          throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + localObject1.getClass());
        }
        if ((i == 14) && (type != 14))
        {
          i = type;
          paramObject = localObject1;
        }
      }
    }
    for (;;)
    {
      localObject3[j] = localzza2;
      j += 1;
      break label575;
      if (type != i)
      {
        throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + paramObject.getClass() + " and a " + localObject1.getClass());
        zzbtE.zzbtO = ((zzsj.zza.zza[])localObject3);
        break;
        throw new RuntimeException("newFieldValueFromValue: unexpected value " + paramObject.getClass().getSimpleName());
      }
    }
  }
  
  public static DataMap zza(zzsi.zza paramzza)
  {
    DataMap localDataMap = new DataMap();
    zzsj.zza[] arrayOfzza = zzbty.zzbtA;
    int j = arrayOfzza.length;
    int i = 0;
    while (i < j)
    {
      zzsj.zza localzza = arrayOfzza[i];
      zza(zzbtz, localDataMap, name, zzbtC);
      i += 1;
    }
    return localDataMap;
  }
  
  private static ArrayList zza(List paramList, zzsj.zza.zza.zza paramzza, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(zzbtO.length);
    paramzza = zzbtO;
    int k = paramzza.length;
    int i = 0;
    if (i < k)
    {
      zzsj.zza[] arrayOfzza = paramzza[i];
      if (type == 14) {
        localArrayList.add(null);
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramInt == 9)
        {
          DataMap localDataMap = new DataMap();
          arrayOfzza = zzbtE.zzbtN;
          int m = arrayOfzza.length;
          int j = 0;
          while (j < m)
          {
            zzsj.zza localzza = arrayOfzza[j];
            zza(paramList, localDataMap, name, zzbtC);
            j += 1;
          }
          localArrayList.add(localDataMap);
        }
        else if (paramInt == 2)
        {
          localArrayList.add(zzbtE.zzbtG);
        }
        else
        {
          if (paramInt != 6) {
            break label191;
          }
          localArrayList.add(Integer.valueOf(zzbtE.zzbtK));
        }
      }
      label191:
      throw new IllegalArgumentException("Unexpected typeOfArrayList: " + paramInt);
    }
    return localArrayList;
  }
  
  private static void zza(List paramList, DataMap paramDataMap, String paramString, zzsj.zza.zza paramzza)
  {
    int i = type;
    if (i == 14)
    {
      paramDataMap.putString(paramString, null);
      return;
    }
    Object localObject1 = zzbtE;
    if (i == 1)
    {
      paramDataMap.putByteArray(paramString, zzbtF);
      return;
    }
    if (i == 11)
    {
      paramDataMap.putStringArray(paramString, zzbtP);
      return;
    }
    if (i == 12)
    {
      paramDataMap.putLongArray(paramString, zzbtQ);
      return;
    }
    if (i == 15)
    {
      paramDataMap.putFloatArray(paramString, zzbtR);
      return;
    }
    if (i == 2)
    {
      paramDataMap.putString(paramString, zzbtG);
      return;
    }
    if (i == 3)
    {
      paramDataMap.putDouble(paramString, zzbtH);
      return;
    }
    if (i == 4)
    {
      paramDataMap.putFloat(paramString, zzbtI);
      return;
    }
    if (i == 5)
    {
      paramDataMap.putLong(paramString, zzbtJ);
      return;
    }
    if (i == 6)
    {
      paramDataMap.putInt(paramString, zzbtK);
      return;
    }
    if (i == 7)
    {
      paramDataMap.putByte(paramString, (byte)zzbtL);
      return;
    }
    if (i == 8)
    {
      paramDataMap.putBoolean(paramString, zzbtM);
      return;
    }
    if (i == 13)
    {
      if (paramList == null) {
        throw new RuntimeException("populateBundle: unexpected type for: " + paramString);
      }
      paramDataMap.putAsset(paramString, (Asset)paramList.get((int)zzbtS));
      return;
    }
    if (i == 9)
    {
      paramzza = new DataMap();
      localObject1 = zzbtN;
      int j = localObject1.length;
      i = 0;
      while (i < j)
      {
        Object localObject2 = localObject1[i];
        zza(paramList, paramzza, name, zzbtC);
        i += 1;
      }
      paramDataMap.putDataMap(paramString, paramzza);
      return;
    }
    if (i == 10)
    {
      i = zza(paramString, zzbtO);
      paramList = zza(paramList, (zzsj.zza.zza.zza)localObject1, i);
      if (i == 14)
      {
        paramDataMap.putStringArrayList(paramString, paramList);
        return;
      }
      if (i == 9)
      {
        paramDataMap.putDataMapArrayList(paramString, paramList);
        return;
      }
      if (i == 2)
      {
        paramDataMap.putStringArrayList(paramString, paramList);
        return;
      }
      if (i == 6)
      {
        paramDataMap.putIntegerArrayList(paramString, paramList);
        return;
      }
      throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
    }
    throw new RuntimeException("populateBundle: unexpected type " + i);
  }
  
  private static zzsj.zza[] zza(DataMap paramDataMap, List paramList)
  {
    Object localObject1 = new TreeSet(paramDataMap.keySet());
    zzsj.zza[] arrayOfzza = new zzsj.zza[((TreeSet)localObject1).size()];
    localObject1 = ((TreeSet)localObject1).iterator();
    int i = 0;
    while (((Iterator)localObject1).hasNext())
    {
      String str = (String)((Iterator)localObject1).next();
      Object localObject2 = paramDataMap.get(str);
      arrayOfzza[i] = new zzsj.zza();
      name = str;
      zzbtC = zza(paramList, localObject2);
      i += 1;
    }
    return arrayOfzza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
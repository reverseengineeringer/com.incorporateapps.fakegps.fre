package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  private final int mVersionCode;
  private final HashMap zzamV;
  private final ArrayList zzamW;
  private final String zzamX;
  
  FieldMappingDictionary(int paramInt, ArrayList paramArrayList, String paramString)
  {
    mVersionCode = paramInt;
    zzamW = null;
    zzamV = zze(paramArrayList);
    zzamX = ((String)zzx.zzz(paramString));
    zzry();
  }
  
  public FieldMappingDictionary(Class paramClass)
  {
    mVersionCode = 1;
    zzamW = null;
    zzamV = new HashMap();
    zzamX = paramClass.getCanonicalName();
  }
  
  private static HashMap zze(ArrayList paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      FieldMappingDictionary.Entry localEntry = (FieldMappingDictionary.Entry)paramArrayList.get(i);
      localHashMap.put(className, localEntry.zzrC());
      i += 1;
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    zzc localzzc = CREATOR;
    return 0;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = zzamV.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localStringBuilder.append((String)localObject).append(":\n");
      localObject = (Map)zzamV.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str).append(": ");
        localStringBuilder.append(((Map)localObject).get(str));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc localzzc = CREATOR;
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public void zza(Class paramClass, Map paramMap)
  {
    zzamV.put(paramClass.getCanonicalName(), paramMap);
  }
  
  public boolean zzb(Class paramClass)
  {
    return zzamV.containsKey(paramClass.getCanonicalName());
  }
  
  public Map zzcR(String paramString)
  {
    return (Map)zzamV.get(paramString);
  }
  
  ArrayList zzrA()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzamV.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new FieldMappingDictionary.Entry(str, (Map)zzamV.get(str)));
    }
    return localArrayList;
  }
  
  public String zzrB()
  {
    return zzamX;
  }
  
  public void zzry()
  {
    Iterator localIterator1 = zzamV.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localObject = (Map)zzamV.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext()) {
        ((FastJsonResponse.Field)((Map)localObject).get((String)localIterator2.next())).zza(this);
      }
    }
  }
  
  public void zzrz()
  {
    Iterator localIterator1 = zzamV.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      Map localMap = (Map)zzamV.get(str1);
      HashMap localHashMap = new HashMap();
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localHashMap.put(str2, ((FastJsonResponse.Field)localMap.get(str2)).zzro());
      }
      zzamV.put(str1, localHashMap);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
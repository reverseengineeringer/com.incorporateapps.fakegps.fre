package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary$Entry
  implements SafeParcelable
{
  public static final zzd CREATOR = new zzd();
  final String className;
  final int versionCode;
  final ArrayList zzamY;
  
  FieldMappingDictionary$Entry(int paramInt, String paramString, ArrayList paramArrayList)
  {
    versionCode = paramInt;
    className = paramString;
    zzamY = paramArrayList;
  }
  
  FieldMappingDictionary$Entry(String paramString, Map paramMap)
  {
    versionCode = 1;
    className = paramString;
    zzamY = zzM(paramMap);
  }
  
  private static ArrayList zzM(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new FieldMappingDictionary.FieldMapPair(str, (FastJsonResponse.Field)paramMap.get(str)));
    }
    return localArrayList;
  }
  
  public int describeContents()
  {
    zzd localzzd = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd localzzd = CREATOR;
    zzd.zza(this, paramParcel, paramInt);
  }
  
  HashMap zzrC()
  {
    HashMap localHashMap = new HashMap();
    int j = zzamY.size();
    int i = 0;
    while (i < j)
    {
      FieldMappingDictionary.FieldMapPair localFieldMapPair = (FieldMappingDictionary.FieldMapPair)zzamY.get(i);
      localHashMap.put(key, zzamZ);
      i += 1;
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionary.Entry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
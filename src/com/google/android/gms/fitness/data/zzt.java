package com.google.android.gms.fitness.data;

import java.util.List;

public class zzt
{
  public static int zza(Object paramObject, List paramList)
  {
    int i;
    if (paramObject == null) {
      i = -1;
    }
    int j;
    do
    {
      return i;
      j = paramList.indexOf(paramObject);
      i = j;
    } while (j >= 0);
    paramList.add(paramObject);
    return paramList.size() - 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
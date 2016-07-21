package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public final class AppContentUtils
{
  public static ArrayList zza(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    zza(paramDataHolder, 1, paramString, "action_id", paramInt, new AppContentUtils.1(localArrayList), paramArrayList);
    return localArrayList;
  }
  
  private static void zza(DataHolder paramDataHolder, int paramInt1, String paramString1, String paramString2, int paramInt2, AppContentUtils.AppContentRunner paramAppContentRunner, ArrayList paramArrayList)
  {
    DataHolder localDataHolder = (DataHolder)paramArrayList.get(paramInt1);
    paramDataHolder = paramDataHolder.zzd(paramString1, paramInt2, paramDataHolder.zzbH(paramInt2));
    if (!TextUtils.isEmpty(paramDataHolder))
    {
      paramInt2 = localDataHolder.getCount();
      paramDataHolder = paramDataHolder.split(",");
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        paramString1 = localDataHolder.zzd(paramString2, paramInt1, localDataHolder.zzbH(paramInt1));
        if ((!TextUtils.isEmpty(paramString1)) && (zzmn.zzb(paramDataHolder, paramString1))) {
          paramAppContentRunner.zzb(paramArrayList, paramInt1);
        }
        paramInt1 += 1;
      }
    }
  }
  
  public static ArrayList zzb(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    zza(paramDataHolder, 2, paramString, "annotation_id", paramInt, new AppContentUtils.2(localArrayList), paramArrayList);
    return localArrayList;
  }
  
  public static ArrayList zzc(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    zza(paramDataHolder, 4, paramString, "condition_id", paramInt, new AppContentUtils.3(localArrayList), paramArrayList);
    return localArrayList;
  }
  
  public static Bundle zzd(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    Bundle localBundle = new Bundle();
    zza(paramDataHolder, 3, paramString, "tuple_id", paramInt, new AppContentUtils.4((DataHolder)paramArrayList.get(3), localBundle), paramArrayList);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
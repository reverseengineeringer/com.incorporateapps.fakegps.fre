package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

public class HistoryApi$ViewIntentBuilder
{
  private final Context mContext;
  private long zzRD;
  private final DataType zzavT;
  private DataSource zzavU;
  private long zzavV;
  private String zzavW;
  
  public HistoryApi$ViewIntentBuilder(Context paramContext, DataType paramDataType)
  {
    mContext = paramContext;
    zzavT = paramDataType;
  }
  
  private Intent zzl(Intent paramIntent)
  {
    if (zzavW == null) {}
    Intent localIntent;
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localIntent = new Intent(paramIntent).setPackage(zzavW);
      localResolveInfo = mContext.getPackageManager().resolveActivity(localIntent, 0);
    } while (localResolveInfo == null);
    paramIntent = activityInfo.name;
    localIntent.setComponent(new ComponentName(zzavW, paramIntent));
    return localIntent;
  }
  
  public Intent build()
  {
    boolean bool2 = true;
    if (zzRD > 0L)
    {
      bool1 = true;
      zzx.zza(bool1, "Start time must be set");
      if (zzavV <= zzRD) {
        break label107;
      }
    }
    label107:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "End time must be set and after start time");
      Intent localIntent = new Intent("vnd.google.fitness.VIEW");
      localIntent.setType(DataType.getMimeType(zzavU.getDataType()));
      localIntent.putExtra("vnd.google.fitness.start_time", zzRD);
      localIntent.putExtra("vnd.google.fitness.end_time", zzavV);
      zzc.zza(zzavU, localIntent, "vnd.google.fitness.data_source");
      return zzl(localIntent);
      bool1 = false;
      break;
    }
  }
  
  public ViewIntentBuilder setDataSource(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource.getDataType().equals(zzavT), "Data source %s is not for the data type %s", new Object[] { paramDataSource, zzavT });
    zzavU = paramDataSource;
    return this;
  }
  
  public ViewIntentBuilder setPreferredApplication(String paramString)
  {
    zzavW = paramString;
    return this;
  }
  
  public ViewIntentBuilder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    zzRD = paramTimeUnit.toMillis(paramLong1);
    zzavV = paramTimeUnit.toMillis(paramLong2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
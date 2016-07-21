package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.zzx;

public final class DataSource$Builder
{
  private String mName;
  private int zzabB = -1;
  private DataType zzavT;
  private Device zzawr;
  private Application zzaws;
  private String zzawt = "";
  
  public final DataSource build()
  {
    boolean bool2 = true;
    if (zzavT != null)
    {
      bool1 = true;
      zzx.zza(bool1, "Must set data type");
      if (zzabB < 0) {
        break label47;
      }
    }
    label47:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Must set data source type");
      return new DataSource(this, null);
      bool1 = false;
      break;
    }
  }
  
  public final Builder setAppPackageName(Context paramContext)
  {
    return setAppPackageName(paramContext.getPackageName());
  }
  
  public final Builder setAppPackageName(String paramString)
  {
    zzaws = Application.zzdn(paramString);
    return this;
  }
  
  public final Builder setDataType(DataType paramDataType)
  {
    zzavT = paramDataType;
    return this;
  }
  
  public final Builder setDevice(Device paramDevice)
  {
    zzawr = paramDevice;
    return this;
  }
  
  public final Builder setName(String paramString)
  {
    mName = paramString;
    return this;
  }
  
  public final Builder setStreamName(String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid stream name");
      zzawt = paramString;
      return this;
    }
  }
  
  public final Builder setType(int paramInt)
  {
    zzabB = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.DataSource.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
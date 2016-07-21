package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class DataUpdateListenerRegistrationRequest$Builder
{
  private PendingIntent mPendingIntent;
  private DataType zzavT;
  private DataSource zzavU;
  
  public DataUpdateListenerRegistrationRequest build()
  {
    if ((zzavU != null) || (zzavT != null)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Set either dataSource or dataTYpe");
      zzx.zzb(mPendingIntent, "pendingIntent must be set");
      return new DataUpdateListenerRegistrationRequest(this, null);
    }
  }
  
  public Builder setDataSource(DataSource paramDataSource)
  {
    zzx.zzz(paramDataSource);
    zzavU = paramDataSource;
    return this;
  }
  
  public Builder setDataType(DataType paramDataType)
  {
    zzx.zzz(paramDataType);
    zzavT = paramDataType;
    return this;
  }
  
  public Builder setPendingIntent(PendingIntent paramPendingIntent)
  {
    zzx.zzz(paramPendingIntent);
    mPendingIntent = paramPendingIntent;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
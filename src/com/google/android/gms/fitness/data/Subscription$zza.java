package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzx;

public class Subscription$zza
{
  private DataType zzavT;
  private DataSource zzavU;
  private long zzaxo = -1L;
  private int zzaxp = 2;
  
  public zza zzb(DataSource paramDataSource)
  {
    zzavU = paramDataSource;
    return this;
  }
  
  public zza zzb(DataType paramDataType)
  {
    zzavT = paramDataType;
    return this;
  }
  
  public Subscription zzuz()
  {
    boolean bool2 = false;
    if ((zzavU != null) || (zzavT != null)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzx.zza(bool1, "Must call setDataSource() or setDataType()");
      if ((zzavT != null) && (zzavU != null))
      {
        bool1 = bool2;
        if (!zzavT.equals(zzavU.getDataType())) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zza(bool1, "Specified data type is incompatible with specified data source");
      return new Subscription(this, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Subscription.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
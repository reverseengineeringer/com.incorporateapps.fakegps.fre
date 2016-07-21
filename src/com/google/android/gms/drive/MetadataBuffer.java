package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zze;

public final class MetadataBuffer
  extends AbstractDataBuffer
{
  private MetadataBuffer.zza zzapb;
  
  public MetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    paramDataHolder.zzpZ().setClassLoader(MetadataBuffer.class.getClassLoader());
  }
  
  public final Metadata get(int paramInt)
  {
    MetadataBuffer.zza localzza2 = zzapb;
    MetadataBuffer.zza localzza1;
    if (localzza2 != null)
    {
      localzza1 = localzza2;
      if (MetadataBuffer.zza.zza(localzza2) == paramInt) {}
    }
    else
    {
      localzza1 = new MetadataBuffer.zza(zzahi, paramInt);
      zzapb = localzza1;
    }
    return localzza1;
  }
  
  public final String getNextPageToken()
  {
    return null;
  }
  
  public final void release()
  {
    if (zzahi != null) {
      zze.zza(zzahi);
    }
    super.release();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.MetadataBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
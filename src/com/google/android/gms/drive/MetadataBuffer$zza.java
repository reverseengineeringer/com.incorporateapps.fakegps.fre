package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzp;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zznm;
import java.util.Collection;
import java.util.Iterator;

class MetadataBuffer$zza
  extends Metadata
{
  private final DataHolder zzahi;
  private final int zzajf;
  private final int zzapc;
  
  public MetadataBuffer$zza(DataHolder paramDataHolder, int paramInt)
  {
    zzahi = paramDataHolder;
    zzapc = paramInt;
    zzajf = paramDataHolder.zzbH(paramInt);
  }
  
  public boolean isDataValid()
  {
    return !zzahi.isClosed();
  }
  
  public Object zza(MetadataField paramMetadataField)
  {
    return paramMetadataField.zza(zzahi, zzapc, zzajf);
  }
  
  public Metadata zzsK()
  {
    MetadataBundle localMetadataBundle = MetadataBundle.zztE();
    Iterator localIterator = zze.zztC().iterator();
    while (localIterator.hasNext())
    {
      MetadataField localMetadataField = (MetadataField)localIterator.next();
      if (localMetadataField != zznm.zzatz) {
        localMetadataField.zza(zzahi, localMetadataBundle, zzapc, zzajf);
      }
    }
    return new zzp(localMetadataBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.MetadataBuffer.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
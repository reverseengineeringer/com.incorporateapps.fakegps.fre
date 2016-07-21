package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzp
  extends Metadata
{
  private final MetadataBundle zzaqB;
  
  public zzp(MetadataBundle paramMetadataBundle)
  {
    zzaqB = paramMetadataBundle;
  }
  
  public final boolean isDataValid()
  {
    return zzaqB != null;
  }
  
  public final String toString()
  {
    return "Metadata [mImpl=" + zzaqB + "]";
  }
  
  public final Object zza(MetadataField paramMetadataField)
  {
    return zzaqB.zza(paramMetadataField);
  }
  
  public final Metadata zzsK()
  {
    return new zzp(zzaqB.zztF());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
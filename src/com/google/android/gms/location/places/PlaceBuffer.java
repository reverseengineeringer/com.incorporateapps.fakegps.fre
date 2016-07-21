package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzr;

public class PlaceBuffer
  extends AbstractDataBuffer
  implements Result
{
  private final Context mContext;
  private final Status zzUX;
  private final String zzaPy;
  
  public PlaceBuffer(DataHolder paramDataHolder, Context paramContext)
  {
    super(paramDataHolder);
    mContext = paramContext;
    zzUX = PlacesStatusCodes.zzhU(paramDataHolder.getStatusCode());
    if ((paramDataHolder != null) && (paramDataHolder.zzpZ() != null))
    {
      zzaPy = paramDataHolder.zzpZ().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
      return;
    }
    zzaPy = null;
  }
  
  public Place get(int paramInt)
  {
    return new zzr(zzahi, paramInt, mContext);
  }
  
  public CharSequence getAttributions()
  {
    return zzaPy;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
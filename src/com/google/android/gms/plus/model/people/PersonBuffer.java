package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.model.people.zzk;

public final class PersonBuffer
  extends AbstractDataBuffer
{
  private final zzd zzbgt;
  
  public PersonBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    if ((paramDataHolder.zzpZ() != null) && (paramDataHolder.zzpZ().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)))
    {
      zzbgt = new zzd(paramDataHolder, PersonEntity.CREATOR);
      return;
    }
    zzbgt = null;
  }
  
  public final Person get(int paramInt)
  {
    if (zzbgt != null) {
      return (Person)zzbgt.zzbG(paramInt);
    }
    return new zzk(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.model.people.PersonBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
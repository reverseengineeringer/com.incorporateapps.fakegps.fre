package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ParcelableCompat$CompatCreator
  implements Parcelable.Creator
{
  final ParcelableCompatCreatorCallbacks mCallbacks;
  
  public ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks paramParcelableCompatCreatorCallbacks)
  {
    mCallbacks = paramParcelableCompatCreatorCallbacks;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return mCallbacks.createFromParcel(paramParcel, null);
  }
  
  public Object[] newArray(int paramInt)
  {
    return mCallbacks.newArray(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.ParcelableCompat.CompatCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
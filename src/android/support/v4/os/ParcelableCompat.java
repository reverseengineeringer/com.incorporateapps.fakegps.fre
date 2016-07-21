package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class ParcelableCompat
{
  public static Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks paramParcelableCompatCreatorCallbacks)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      ParcelableCompatCreatorHoneycombMR2Stub.instantiate(paramParcelableCompatCreatorCallbacks);
    }
    return new ParcelableCompat.CompatCreator(paramParcelableCompatCreatorCallbacks);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.ParcelableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
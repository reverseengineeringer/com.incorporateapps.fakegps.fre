package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

public abstract interface LoaderManager$LoaderCallbacks
{
  public abstract Loader onCreateLoader(int paramInt, Bundle paramBundle);
  
  public abstract void onLoadFinished(Loader paramLoader, Object paramObject);
  
  public abstract void onLoaderReset(Loader paramLoader);
}

/* Location:
 * Qualified Name:     android.support.v4.app.LoaderManager.LoaderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
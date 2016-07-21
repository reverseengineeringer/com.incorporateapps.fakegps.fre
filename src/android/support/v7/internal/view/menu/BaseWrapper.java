package android.support.v7.internal.view.menu;

class BaseWrapper
{
  final Object mWrappedObject;
  
  BaseWrapper(Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    mWrappedObject = paramObject;
  }
  
  public Object getWrappedObject()
  {
    return mWrappedObject;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.BaseWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
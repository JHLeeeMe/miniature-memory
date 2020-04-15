object SpaceAge {
  def onMercury(sec: Double): Double = sec / (31557600 * 0.2408467)
  def onVenus(sec: Double): Double = sec / (31557600 * 0.61519726)
  def onEarth(sec: Double): Double = sec / 31557600
  def onMars(sec: Double): Double = sec / (31557600 * 1.8808158)
  def onJupiter(sec: Double): Double = sec / (31557600 * 11.862615)
  def onSaturn(sec: Double): Double = sec / (31557600 * 29.447498)
  def onUranus(sec: Double): Double = sec / (31557600 * 84.016846)
  def onNeptune(sec: Double): Double = sec / (31557600 * 164.79132)
}

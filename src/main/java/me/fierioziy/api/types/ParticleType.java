package me.fierioziy.api.types;

import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 * <p>Class used to represent particle type with no additional features.</p>
 *
 * <p>It provides a non-reflective <code>create</code> method overloads
 * to construct particle packet with desired parameters.</p>
 *
 * <p>All <code>create</code> methods does not validate parameters in any way.</p>
 */
public class ParticleType {

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z) {
        return create(far,
                x,  y,  z,
                0D, 0D, 0D,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc, int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc, int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z, int count) {
        return create(far,
                x,  y,  z,
                0D, 0D, 0D,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using <code>extra</code> parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc, double extra) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using <code>extra</code> parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc, double extra) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                0D,         0D,         0D,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using <code>extra</code> parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z, double extra) {
        return create(far,
                x,  y,  z,
                0D, 0D, 0D,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc,
                         double offsetX, double offsetY, double offsetZ) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc,
                         double offsetX, double offsetY, double offsetZ) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z,
                         double offsetX, double offsetY, double offsetZ) {
        return create(far,
                x,          y,          z,
                offsetX,    offsetY,    offsetZ,
                0D, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc,
                         double offsetX, double offsetY, double offsetZ,
                         double extra) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc,
                         double offsetX, double offsetY, double offsetZ,
                         double extra) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn 1 particle at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z,
                         double offsetX, double offsetY, double offsetZ,
                         double extra) {
        return create(far,
                x,          y,          z,
                offsetX,    offsetY,    offsetZ,
                extra, 1);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc,
                         double offsetX, double offsetY, double offsetZ,
                         int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc,
                         double offsetX, double offsetY, double offsetZ,
                         int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z,
                         double offsetX, double offsetY, double offsetZ,
                         int count) {
        return create(far,
                x,          y,          z,
                offsetX,    offsetY,    offsetZ,
                0D, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Location</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Location loc,
                         double offsetX, double offsetY, double offsetZ,
                         double extra, int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                extra, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a <code>Vector</code> containing position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, Vector loc,
                         double offsetX, double offsetY, double offsetZ,
                         double extra, int count) {
        return create(far,
                loc.getX(), loc.getY(), loc.getZ(),
                offsetX,    offsetY,    offsetZ,
                extra, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, double x, double y, double z,
                         double offsetX, double offsetY, double offsetZ,
                         double extra, int count) {
        return create(far,
                (float) x,          (float) y,          (float) z,
                (float) offsetX,    (float) offsetY,    (float) offsetZ,
                (float) extra, count);
    }

    /**
     * <p>Construct particle packet that will
     * spawn <code>count</code> particles at specified position
     * using provided offset parameters
     * and extra parameter.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses and depending on implementation this method
     * will look roughly like this:</b></p>
     * <pre>{@code
     * public Object create(boolean far, float x, float  y, float z,
     *                      float offsetX, float offsetY, float offsetZ,
     *                      float extra, int count) {
     *     return new PacketPlayOutWorldParticles(parameters...);
     * }
     * }</pre>
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using <code>isValid</code> method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x component of a position.
     * @param y component of a position.
     * @param z component of a position.
     * @param offsetX parameter used in various contexts.
     * @param offsetY parameter used in various contexts.
     * @param offsetZ parameter used in various contexts.
     * @param extra parameter used in various contexts.
     * @param count amount of particles to spawn.
     * @return a valid NMS <code>Packet</code> object.
     * @throws IllegalStateException when requested particle type
     * is not supported by this server version.
     */
    public Object create(boolean far, float x, float  y, float z,
                         float offsetX, float offsetY, float offsetZ,
                         float extra, int count) {
        throw new IllegalStateException(
                "Requested particle type is not supported by this server version!"
        );
    }

    /**
     * <p>Checks if this particle is supported by this Spigot version.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * @return true if this particle is supported by
     * this Spigot version, false otherwise.
     */
    public boolean isValid() {
        return false;
    }
}
